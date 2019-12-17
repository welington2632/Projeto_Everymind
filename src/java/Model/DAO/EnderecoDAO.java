package Model.DAO;

import Model.Entity.Endereco;
import Util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EnderecoDAO {
    
    public void Criar(Endereco endereco) throws ClassNotFoundException, SQLException {
        Connection con = ConnectionFactory.getConexao();
        PreparedStatement comand = con.prepareStatement("insert into endereco (id, logradouro, cep, numero, complemento) values (nextval('seq_endereco'),?,?,?,?");
        comand.setString(1, endereco.getLogradouro());
        comand.setString(2, endereco.getCep());
        comand.setInt(3, endereco.getNumero());
        comand.setString(4, endereco.getComplemento());
        comand.execute();
        con.close();
    }
    
    public void Alterar(Endereco endereco) throws ClassNotFoundException, SQLException {
        Connection con = ConnectionFactory.getConexao();
        PreparedStatement comand = con.prepareStatement("update endereco set logradouro = ?, cep = ?, numero = ?, complemento = ? WHERE id = ?");
         comand.setString(1, endereco.getLogradouro());
        comand.setString(2, endereco.getCep());
        comand.setInt(3, endereco.getNumero());
        comand.setString(4, endereco.getComplemento());
        comand.execute();
        con.close();
    }   
    
    public List<Endereco> Consultar() throws ClassNotFoundException, SQLException {
        Connection con = ConnectionFactory.getConexao();

        PreparedStatement comando = con.prepareStatement("select id, logradouro,cep,numero,complemento from tbl_endereco");
        ResultSet resultado = comando.executeQuery();

        List<Endereco> todosEndereco = new ArrayList<>();
        while (resultado.next()) {
            Endereco endereco = new Endereco();
            endereco.setId(resultado.getInt("id"));
            endereco.setLogradouro(resultado.getString("Logradouro"));
            endereco.setCep(resultado.getString("Cep"));
            endereco.setNumero(resultado.getInt("numero"));
            endereco.setComplemento(resultado.getString("Complemento"));
            todosEndereco.add(endereco);
        }
        con.close();
        return todosEndereco;
    }
    
      public void Excluir(Endereco endereco) throws ClassNotFoundException, SQLException {
        Connection con = ConnectionFactory.getConexao();
        PreparedStatement comando = con.prepareStatement("delete from tbl_endereco where id=?");
        comando.setInt(1, endereco.getId());
        comando.execute();
        con.close();
    }
      
         public void ConsultarId(Endereco endereco) throws ClassNotFoundException, SQLException {
        Connection con = ConnectionFactory.getConexao();
        PreparedStatement comando = con.prepareStatement("select id, logradouro, cep, numero, complemento from tbl_endereco where id=?");
        comando.setInt(1, endereco.getId());
        ResultSet resultado = comando.executeQuery();

        if (resultado.next()) {
            endereco.setId(resultado.getInt("id"));
            endereco.setLogradouro(resultado.getString("Logradouro"));
            endereco.setCep(resultado.getString("cep"));
            endereco.setNumero(resultado.getInt("Numero"));
            endereco.setComplemento(resultado.getString("complemento"));
        }
        
        con.close();
    }
}