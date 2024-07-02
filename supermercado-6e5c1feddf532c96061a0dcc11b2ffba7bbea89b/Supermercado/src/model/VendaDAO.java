package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import org.mariadb.jdbc.Connection;

public class VendaDAO {
	static DAO dao = new DAO();
	static ArrayList<Venda> vendas;
	static Venda venda;

	public VendaDAO() {
		
	}
	
	public static void insert(Venda venda) {
		
		String sql = "INSERT INTO venda (nome, produtos, quantidade, formaPagemanto, valorVenda) VALUES (?, ?, ?, ?, ?)";

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
			
			statement.setString(1, venda.getNome());
		    statement.setString(2, venda.getProdutos());
		    statement.setString(3, venda.getQuatidade());
		    statement.setString(4, venda.getFormaPagemanto());
		    statement.setString(5, venda.getValorVenda());
			
		    // Execute a instrução SQL
		    statement.executeUpdate();
		    connection.close();
		    JOptionPane.showMessageDialog(null, "Registro inserido com sucesso!");
		    
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ="+e);
		    e.printStackTrace();
		}
	}
	
	public static ArrayList<Venda> select() {
		
		String sql = "SELECT nome, produtos, quantidade, formaPagemanto, valorVenda FROM venda";
		try (Connection connection = (Connection) dao.conectar();
			//PreparedStatement statement = (PreparedStatement) connection.createStatement();
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();) {

			ArrayList<Venda> vendas = new ArrayList<>(); // Crie uma lista para armazenar os clientes
			
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
		    	String produtos = resultSet.getString("produtos");
		    	//JOptionPane.showMessageDialog(null, cpf);
		    	String quantidade = resultSet.getString("quantidade");
		    	//JOptionPane.showMessageDialog(null, rg);
		    	String formaPagemento = resultSet.getString("formaPagemanto");
		    	//JOptionPane.showMessageDialog(null, dataNasc);
		    	String valorVenda = resultSet.getString("valorVenda");
		    	//JOptionPane.showMessageDialog(null, limiteCredit);
		        // Crie um objeto Cliente com os dados recuperados
		        venda = new Venda(nome, produtos, quantidade, formaPagemento, valorVenda);

		        // Adicione o cliente à lista
		        vendas.add(venda);
		    }
		    resultSet.close();
		    connection.close();
		    	
		    return vendas;
		} catch (SQLException e) {
			//JOptionPane.showMessageDialog(null, "Erro no consulta do cliente");
		    //e.printStackTrace();
		    return null;
		}

	}
}
