/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DAO.EnderecoDAO;
import Model.DAO.UserDAO;
import Model.Entity.Endereco;
import Model.Entity.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author welingtonmartins
 */
@WebServlet(name = "EnderecoController", urlPatterns = {"/EnderecoController", "/CadastraEndereco"})
public class EnderecoController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                String uri = request.getRequestURI();

        if (uri.equals(request.getContextPath() + "/CadastraEndereco")) {
            CadastrarEndereco(request, response);
        } 
    }
    
    private void CadastrarEndereco(HttpServletRequest request, HttpServletResponse response) {
        try {
            // Create Entity User
            User user = new User();
            UserDAO userDAO = new UserDAO();
            user.setId(Integer.parseInt(request.getParameter("userId")));
            user = userDAO.SelectUserById(user);
            Endereco endereco = new Endereco();
            endereco.setCep(request.getParameter("cep"));
            endereco.setComplemento(request.getParameter("complemento"));
            endereco.setLogradouro(request.getParameter("logradouro"));
            endereco.setNumero(Integer.parseInt(request.getParameter("numero")));
            EnderecoDAO enderecoDAO = new EnderecoDAO();
            endereco.setId(enderecoDAO.Criar(endereco));
            user.setEndereco(endereco);
            userDAO.Update(user);
            request.getSession(true).setAttribute("loggedUser", user);
            request.getRequestDispatcher("userArea.jsp").forward(request, response);
        } catch (Exception ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            
        }
    }

}
