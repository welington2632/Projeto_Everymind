package Model.DAO;

import Model.Entity.User;
import Util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {

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
    
    public User SelectUserByUsername(User user) throws SQLException, ClassNotFoundException {
        Connection con = ConnectionFactory.getConexao();
                PreparedStatement comand = con.prepareStatement("select * from login where username == ?");
                comand.setString(1, user.getUsername());      
                ResultSet result = comand.executeQuery();
                User searchUser = new User();
                if (result.next()){
                    searchUser.setId(Integer.parseInt(result.getString("id")));
                    searchUser.setName(result.getString("name"));
                    searchUser.setEmail(result.getString("email"));
                    searchUser.setUsername(result.getString("username"));
                    searchUser.setPassword(result.getString("password"));
                }
                return searchUser;
    }
    
    public User SelectUserByEmail(User user) throws SQLException, ClassNotFoundException {
        Connection con = ConnectionFactory.getConexao();
                PreparedStatement comand = con.prepareStatement("select * from login where email == ?");
                comand.setString(1, user.getEmail());      
                ResultSet result = comand.executeQuery();
                User searchUser = new User();
                if (result.next()){
                    searchUser.setId(Integer.parseInt(result.getString("id")));
                    searchUser.setName(result.getString("name"));
                    searchUser.setEmail(result.getString("email"));
                    searchUser.setUsername(result.getString("username"));
                    searchUser.setPassword(result.getString("password"));
                }
                return searchUser;
    }
}
