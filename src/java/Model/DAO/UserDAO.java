package Model.DAO;

import Model.Entity.User;
import Util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {

    // Create a user in the database
    public void Create(User user) throws SQLException, ClassNotFoundException {
        Connection con = ConnectionFactory.getConexao();
        PreparedStatement comand = con.prepareStatement("insert into login (id, name, email, username, password) values (nextval('seq_login'),?,?,?,?)");
        comand.setString(1, user.getName());
        comand.setString(2, user.getEmail());
        comand.setString(3, user.getUsername());
        comand.setString(4, user.getPassword());
        comand.execute();
        con.close();
    }
    
    public void Update(User user) throws SQLException, ClassNotFoundException {
        Connection con = ConnectionFactory.getConexao();
        PreparedStatement comand = con.prepareStatement("update login set nome = ?, cnpj = ?, email = ?, senha = ?, enderecofk = ?, tipousuariofk = ? WHERE id = ?");
        comand.setString(1, user.getName());
        comand.setString(2, user.getEmail());
        comand.setString(3, user.getUsername());
        comand.setString(4, user.getPassword());
        comand.execute();
        con.close();
    }
    
    // Validate username with password
    public boolean Validation(User user) throws SQLException, ClassNotFoundException {
        Connection con = ConnectionFactory.getConexao();
        PreparedStatement comand = con.prepareStatement("select * from login where username = ?");
        comand.setString(1, user.getUsername());
        ResultSet result = comand.executeQuery();
        boolean validation = false;
        if (result.next()) {
            if (result.getString("password").equals(user.getPassword())) {
                validation = true;
            }
        }
        con.close();
        return validation;
    }
    
    // Select a user by username
    public User SelectUserByUsername(User user) throws SQLException, ClassNotFoundException {
        Connection con = ConnectionFactory.getConexao();
        PreparedStatement comand = con.prepareStatement("select * from login where username = ?");
        comand.setString(1, user.getUsername());
        ResultSet result = comand.executeQuery();
        User searchUser = new User();
        if (result.next()) {
            searchUser.setId(Integer.parseInt(result.getString("id")));
            searchUser.setName(result.getString("name"));
            searchUser.setEmail(result.getString("email"));
            searchUser.setUsername(result.getString("username"));
            searchUser.setPassword(result.getString("password"));
        }
        con.close();
        return searchUser;
    }
    
    // Select a user by e-mail
    public User SelectUserByEmail(User user) throws SQLException, ClassNotFoundException {
        Connection con = ConnectionFactory.getConexao();
        PreparedStatement comand = con.prepareStatement("select * from login where email = ?");
        comand.setString(1, user.getEmail());
        ResultSet result = comand.executeQuery();
        User searchUser = new User();
        if (result.next()) {
            searchUser.setId(Integer.parseInt(result.getString("id")));
            searchUser.setName(result.getString("name"));
            searchUser.setEmail(result.getString("email"));
            searchUser.setUsername(result.getString("username"));
            searchUser.setPassword(result.getString("password"));
        }
        con.close();
        return searchUser;
    }
    
    //Select a user by username or e-mail
    public User SelectUserByEmailAndUserName(User user) throws SQLException, ClassNotFoundException {
        Connection con = ConnectionFactory.getConexao();
        PreparedStatement comand = con.prepareStatement("select * from login where email = ? or username = ?");
        comand.setString(1, user.getEmail());
        comand.setString(2, user.getUsername());
        ResultSet result = comand.executeQuery();
        User searchUser = new User();
        if (result.next()) {
            searchUser.setId(Integer.parseInt(result.getString("id")));
            searchUser.setName(result.getString("name"));
            searchUser.setEmail(result.getString("email"));
            searchUser.setUsername(result.getString("username"));
            searchUser.setPassword(result.getString("password"));
        }
        con.close();
        return searchUser;
    }
}
