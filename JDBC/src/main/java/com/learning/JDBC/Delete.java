package com.learning.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
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
	
	public static void deleteStudent() throws SQLException{
		String sql = "delete from student where studentId=105";
		Statement stmt = getConnection().createStatement();
		int i = stmt.executeUpdate(sql);
		System.out.println("Student having id:105 deleted successfully");
	}
	public static void main(String[] args) throws SQLException {
		deleteStudent();

	}

}
