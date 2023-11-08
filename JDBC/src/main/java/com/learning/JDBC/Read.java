package com.learning.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Read {
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
	public static void readAll() throws SQLException{
		String sql = "select * from student";
		Statement stmt = getConnection().createStatement();
		ResultSet resultSet = stmt.executeQuery(sql);
		while(resultSet.next()){
			System.out.println("StudentId :"+resultSet.getInt(1));
			System.out.println("StudentName :"+resultSet.getString(2));
			System.out.println("CourseEnrolled :"+resultSet.getString(3));
			System.out.println("_____________________________________________");
			
		}
	}
	public static void readById() throws SQLException{
		
		String sql = "select * from student where studentId=102";
		Statement stmt = getConnection().createStatement();
		ResultSet resultSet = stmt.executeQuery(sql);
		System.out.println("Fetching the record based on student-id");
		while(resultSet.next()){
			System.out.println("StudentId :"+resultSet.getInt(1));
			System.out.println("StudentName :"+resultSet.getString(2));
			System.out.println("CourseEnrolled :"+resultSet.getString(3));
			System.out.println("_____________________________________________");
			
		}
	}
	public static void main(String[] args) throws SQLException {
		//readAll();
		readById();
	}

}
