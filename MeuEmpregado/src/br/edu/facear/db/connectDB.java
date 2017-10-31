package br.edu.facear.db;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectDB {
	private Connection con;

	private String driver;
	private String url;
	private String username;
	private String password;

	/**
	 * Classe de conexão com Banco de Dados
	 * 
	 */
	public connectDB(){
		// Melhoria futura: colocar essas informações em arquivo *.properties
		driver = "com.mysql.jdbc.Driver";
		url = "jdbc:mysql://localhost:3306/MeuEmpregado";
		username = "MeuEmpregado";
		password = "";
	}

	public Connection getConnection() throws IOException, ClassNotFoundException, SQLException{
		Class.forName(driver) ;
		this.con = DriverManager.getConnection(url, username, password);

		return this.con;
	}

}
