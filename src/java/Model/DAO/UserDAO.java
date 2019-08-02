package Model.DAO;

import Model.Entity.User;
import Util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDAO {

    public void Create(User user) throws ClassNotFoundException, SQLException {
        Connection con = ConnectionFactory.getConexao();
        PreparedStatement comand = con.prepareStatement("insert into usuario (id, name, email, username, password) values (nextval('seq_usuario'),?,?,?,?)");
        comand.setString(1, user.getName());
        comand.setString(2, user.getEmail());
        comand.setString(3, user.getUsername());
        comand.setString(4, user.getPassword());
        comand.execute();
        
        con.close();
    }
}
