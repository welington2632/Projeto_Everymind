package Controller;

import Model.DAO.UserDAO;
import Model.Entity.User;
import java.io.IOException;
import static java.lang.System.out;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "UserController", urlPatterns = {"/UserController", "/createUser", "/signIn","/logout"})
public class UserController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.equals(request.getContextPath() + "/createUser")) {
            CreateUser(request, response);
        } else if (uri.equals(request.getContextPath() + "/signIn")) {
            SignIn(request, response);
        } else if (uri.equals(request.getContextPath() + "/logout")) {
            Logout(request, response);
        }
    }

    private void CreateUser(HttpServletRequest request, HttpServletResponse response) {
        try {
            // Verify password compatibility
            if (!request.getParameter("password").equals(request.getParameter("confirm_password"))) {
                request.setAttribute("messageError", "As senhas não são iguais, tente novamente!");
                request.getRequestDispatcher("/jsp/error.jsp").forward(request, response);
            }
            User user = new User();
            user.setName(request.getParameter("name"));
            user.setEmail(request.getParameter("email"));
            user.setUsername(request.getParameter("username"));
            user.setPassword(request.getParameter("password"));
            UserDAO dao = new UserDAO();

            // Verify e-mail and username
            User validationUser = dao.SelectUserByEmailAndUserName(user);
            if (validationUser.getUsername() != null || validationUser.getEmail() != null) {
                validationUser = dao.SelectUserByUsername(user);
                String messageError = validationUser.getUsername() != null ? "Username já em uso!" : "E-mail já em uso!";
                request.setAttribute("messageError", messageError);
                request.getRequestDispatcher("/jsp/error.jsp").forward(request, response);

            } else {
                dao.Create(user);
                request.setAttribute("User", user);
                request.getRequestDispatcher("/jsp/sucess.jsp").forward(request,response);
            }

        } catch (Exception ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void SignIn(HttpServletRequest request, HttpServletResponse response) {
        try {
            User user = new User();
            user.setName(request.getParameter("name"));
            user.setEmail(request.getParameter("email"));
            user.setUsername(request.getParameter("username"));
            user.setPassword(request.getParameter("password"));
            UserDAO dao = new UserDAO();
            if (dao.Validation(user)) {
                user = dao.SelectUserByUsername(user);
                request.setAttribute("User", user);
                request.getRequestDispatcher("/jsp/userArea.jsp").forward(request, response);
            } else {
                request.setAttribute("messageError", "Usuário ou senha inválidos!");
                request.getRequestDispatcher("/jsp/error.jsp").forward(request, response);
            }
        } catch (Exception ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void Logout(HttpServletRequest request, HttpServletResponse response) {
        request.getSession().removeAttribute("loggedUser");
        try {
            response.sendRedirect("/jsp/sign_in.jsp");
        } catch (IOException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
