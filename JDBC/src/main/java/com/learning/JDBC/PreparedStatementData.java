package com.learning.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementData {
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
	public static void insertData(Scanner sc) throws SQLException{
		System.out.println("Enter the id of the student :");
		int id = sc.nextInt();
		System.out.println("Enter the name of the student :");
		String name = sc.next();
		System.out.println("Enter the course :");
		String course = sc.next();
		
		PreparedStatement prepareStatement = getConnection().prepareStatement("insert into student values(?,?,?)");
		prepareStatement.setInt(1, id);
		prepareStatement.setString(2, name);
		prepareStatement.setString(3, course);
		
		int i = prepareStatement.executeUpdate();
		System.out.println("Student details added successfully");
		
	}
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		insertData(sc);

	}

}
