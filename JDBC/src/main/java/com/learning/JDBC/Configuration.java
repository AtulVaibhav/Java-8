package com.learning.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * We are connecting our java app with database
 * Four credentials required:
 * 1.Register the driver class
 * 2.We need database url
 * 3.We need username
 * 4.We need password
 *
 */
public class Configuration {
	private static final String DRIVER_CLASS="com.mysql.jdbc.Driver";
	private static final String DATABASE_URL="jdbc:mysql://localhost:3306/jdbc";
	private static final String DATABAE_USERNAME="root";
	private static final String DATABASE_PASSWORD="root";
	
	public static Connection getConnection(){
		Connection con=null;
		try {
			//Register the driver class
			Class.forName(DRIVER_CLASS);
			
			//Getting Connection
			con = DriverManager.getConnection(DATABASE_URL,DATABAE_USERNAME,DATABASE_PASSWORD);
			
			if(con!=null){
				System.out.println("Connection established");
			}
				
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
	

	public static void main(String[] args) {
		System.out.println(getConnection());
	}

}
