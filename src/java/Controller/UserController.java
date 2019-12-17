package Controller;

import Model.DAO.UserDAO;
import Model.Entity.User;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "UserController", urlPatterns = {"/UserController", "/createUser", "/signIn", "/logout"})
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
            // Create Entity User
            User user = new User();
            user.setName(request.getParameter("name"));
            user.setEmail(request.getParameter("email"));
            user.setUsername(request.getParameter("username"));
            user.setPassword(request.getParameter("password"));
            UserDAO dao = new UserDAO();

            // Validation User Object
            User validationUser = dao.SelectUserByEmailAndUserName(user);
            
            if (!request.getParameter("password").equals(request.getParameter("confirm_password"))) {
                // Verify password compatibility
                request.setAttribute("messageError", "Divergent passwords, please try again!");
                request.getRequestDispatcher("error.jsp").forward(request, response);
            } else if (validationUser.getUsername() != null || validationUser.getEmail() != null) {
                //If you already have a registered user or email
                validationUser = dao.SelectUserByUsername(user);
                String messageError = validationUser.getUsername() != null ? "Username already in use!" : "E-mail already in use";
                request.setAttribute("messageError", messageError);
                request.getRequestDispatcher("error.jsp").forward(request, response);
            } else {
                // if OK, create user in database
                dao.Create(user);
                request.setAttribute("User", user);
                request.getRequestDispatcher("sucess.jsp").forward(request, response);
            }
        } catch (Exception ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            
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
                request.getSession(true).setAttribute("loggedUser", user);
                request.getRequestDispatcher("userArea.jsp").forward(request, response);
            } else {
                request.setAttribute("messageError", "Incorrect username or password!");
                request.getRequestDispatcher("error.jsp").forward(request, response);
            }
        } catch (Exception ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void Logout(HttpServletRequest request, HttpServletResponse response) {
        request.getSession().removeAttribute("loggedUser");
        try {
            response.sendRedirect("sign_in.jsp");
        } catch (IOException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
