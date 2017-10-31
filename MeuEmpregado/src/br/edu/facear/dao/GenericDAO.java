package br.edu.facear.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import br.edu.facear.db.connectDB;

public class GenericDAO {
	private connectDB db = new connectDB();
	protected Connection connect;

	public void openConnection() throws ClassNotFoundException, 
	IOException, SQLException{
		connect = db.getConnection();
	}

	public void closeConnection(){
		if(connect != null){
			try {
				connect.close();
			} catch (SQLException e) {
				System.out.println("Error on Closing Connection");
			}
		}
	}
}
