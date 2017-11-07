package com.facear.meuempregado.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {

	private static String user = "";
	private static String pass = "";
	private static String url = "";
	private static String driver = "";
	
	
	public Conexao() 
	{
		 user = "root";
		 pass = "";
		 url = "jdbc:mysql:/localhost:3306/meuempregado";
		 driver = "com.mysql.jdbc.Driver";
	}
	
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, user, pass);
		return con;
	}
}
