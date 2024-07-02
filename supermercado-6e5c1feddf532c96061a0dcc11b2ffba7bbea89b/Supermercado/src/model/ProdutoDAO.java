package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import org.mariadb.jdbc.Connection;

public class ProdutoDAO {
	static DAO dao = new DAO();
	static ArrayList<Produto> produtos;
	static Produto produto;
	
	public ProdutoDAO() {
		
	}
	
	public static void insert(Produto produto) {
		
		String sql = "INSERT INTO produto (nome, tipo, precoVenda, precoCompra, fab, val, quantidade) VALUES (?, ?, ?, ?, ?, ?, ?)";

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
			
			statement.setString(1, produto.getNome());
		    statement.setString(2, produto.getTipo());
		    statement.setString(3, produto.getPrecoVenda());
		    statement.setString(4, produto.getPrecoCompra());
		    statement.setString(5, produto.getFab());
		    statement.setString(6, produto.getVal());
		    statement.setString(7, produto.getQuantidade());
			
		    // Execute a instrução SQL
		    statement.executeUpdate();
		    connection.close();
		    JOptionPane.showMessageDialog(null, "Registro inserido com sucesso!");
		    
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ="+e);
		}
	}
	
	public static ArrayList<Produto> select() {
		
		String sql = "SELECT nome, tipo, precoVenda, precoCompra, fab, val, quantidade FROM produto";
		try (Connection connection = (Connection) dao.conectar();
			//PreparedStatement statement = (PreparedStatement) connection.createStatement();
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();) {

			ArrayList<Produto> produtos = new ArrayList<>(); 
			
		    while (resultSet.next()) {
		    	/*
		        int id = resultSet.getInt("id");
		        String nome = resultSet.getString("nome");
		        String email = resultSet.getString("email");
		        int idade = resultSet.getInt("idade");
				*/
		    	String nome = resultSet.getString("nome");
		    	String tipo = resultSet.getString("tipo");
		    	String precoVenda = resultSet.getString("precoVenda");
		    	String precoCompra = resultSet.getString("precoCompra");
		    	String fab = resultSet.getString("fab");
		    	String val = resultSet.getString("val");
		    	String quantidade = resultSet.getString("quantidade");
		        // Crie um objeto Cliente com os dados recuperados
		        produto = new Produto(nome, tipo, precoVenda, precoCompra, fab, val, quantidade);

		        // Adicione o cliente à lista
		        produtos.add(produto);
		    }
		    resultSet.close();
		    connection.close();
		    	
		    return produtos;
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro na consulta do Poduto");
		    return null;
		}

	}
	
	public static void updata(String id, String quantidade) {
		
		String sql = "UPDATE produto SET quantidade = ? WHERE nome = ?";

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
			
			statement.setString(1, quantidade);
		    statement.setString(2, id);
		    
			
		    // Execute a instrução SQL
		    statement.executeUpdate();
		    connection.close();
		    JOptionPane.showMessageDialog(null, "Registro inserido com sucesso!");
		    
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ="+e);
		}
	}
	
}
