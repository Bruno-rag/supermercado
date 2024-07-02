package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DAO {
	private Connection con;
	//private String driver = "com.mysql.cj.jdbc.Driver";
	//private String url = "jdbc:mysql://localhost:3306/supermercado";
	private String driver = "org.mariadb.jdbc.Driver";
	private String url = "jdbc:mariadb://localhost:3306/supermercado";
	private String user = "root";
	private String password = "1234";
	
	public Connection conectar() {
		try {
		    
			Class.forName(driver);
		    con = DriverManager.getConnection(url, user, password);
		    return con; 
		    //Execute operações de banco de dados aqui
		    //con.close();
		} catch (SQLException e) {
		    e.printStackTrace();
		    return null;
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	
}
