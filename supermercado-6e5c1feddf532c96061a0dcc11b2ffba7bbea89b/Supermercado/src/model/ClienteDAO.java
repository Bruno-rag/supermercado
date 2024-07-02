package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import org.mariadb.jdbc.Connection;
import org.mariadb.jdbc.Statement;

import com.mysql.jdbc.Driver;

public class ClienteDAO {
	static DAO dao = new DAO();
	static ArrayList<Cliente> clientes;
	static Cliente cliente;
	//Cliente cliente;
	
	public ClienteDAO() {
		
	}
	
	public static void insert(Cliente cliente) {
		
		String sql = "INSERT INTO cliente (nome, cpf, rg, dataNasc, limiteCredit) VALUES (?, ?, ?, ?, ?)";

		try (Connection connection = (Connection) dao.conectar();
		     PreparedStatement statement = connection.prepareStatement(sql)) {
			/*
		    // Defina os valores para cada parâmetro
		    statement.setString(1, "João Silva");
		    statement.setString(2, "852.789.584-45");
		    statement.setString(3, "852.789.584-45");
		    statement.setString(4, "10/01/1998");
		    statement.setString(5, "2000");
		    //statement.setInt(3, 30);
			*/
			
			statement.setString(1, cliente.getNome());
		    statement.setString(2, cliente.getCpf());
		    statement.setString(3, cliente.getRg());
		    statement.setString(4, cliente.getDataNasc());
		    statement.setString(5, cliente.getLimiteCredit());
			
		    // Execute a instrução SQL
		    statement.executeUpdate();
		    connection.close();
		    JOptionPane.showMessageDialog(null, "Registro inserido com sucesso!");
		    
		} catch (SQLException e) {
		    e.printStackTrace();
		}
	}
	
	public static ArrayList<Cliente> select() {
		
		String sql = "SELECT nome, cpf, rg, dataNasc, limiteCredit FROM cliente";
		try (Connection connection = (Connection) dao.conectar();
			//PreparedStatement statement = (PreparedStatement) connection.createStatement();
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();) {

			ArrayList<Cliente> clientes = new ArrayList<>(); // Crie uma lista para armazenar os clientes
			
		    while (resultSet.next()) {
		    	/*
		        int id = resultSet.getInt("id");
		        String nome = resultSet.getString("nome");
		        String email = resultSet.getString("email");
		        int idade = resultSet.getInt("idade");
				*/
		    	//JOptionPane.showMessageDialog(null, "TESTE SELECT");
		    	String nome = resultSet.getString("nome");
		    	//JOptionPane.showMessageDialog(null, nome);
		    	String cpf = resultSet.getString("cpf");
		    	//JOptionPane.showMessageDialog(null, cpf);
		    	String rg = resultSet.getString("rg");
		    	//JOptionPane.showMessageDialog(null, rg);
		    	String dataNasc = resultSet.getString("dataNasc");
		    	//JOptionPane.showMessageDialog(null, dataNasc);
		    	String limiteCredit = resultSet.getString("limiteCredit");
		    	//JOptionPane.showMessageDialog(null, limiteCredit);
		        // Crie um objeto Cliente com os dados recuperados
		        cliente = new Cliente(nome, cpf, rg, dataNasc, limiteCredit);

		        // Adicione o cliente à lista
		        clientes.add(cliente);
		    }
		    resultSet.close();
		    connection.close();
		    	
		    return clientes;
		} catch (SQLException e) {
			//JOptionPane.showMessageDialog(null, "Erro no consulta do cliente");
		    //e.printStackTrace();
		    return null;
		}

	}
	
}
