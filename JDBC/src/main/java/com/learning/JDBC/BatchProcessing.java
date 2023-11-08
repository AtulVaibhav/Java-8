package com.learning.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchProcessing {
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
	public static void multipleQuery() throws SQLException{
		String sql1 ="insert into student values (106,'Vivek','python')";
		String sql2 ="insert into student values (107,'Aashish','python')";
		String sql3 ="insert into student values (108,'John','Java')";
		String sql4 ="insert into student values (109,'Prateek','NodeJS')";
		
		Statement stmt = getConnection().createStatement();
		stmt.addBatch(sql1);
	    stmt.addBatch(sql2);
	    stmt.addBatch(sql3);
	    stmt.addBatch(sql4);
	    int[] rows = stmt.executeBatch();
	    for(int i=0;i<rows.length;i++){
	    	System.out.println(i+" row affected");
	    }
	
	}
	public static void main(String[] args) throws SQLException {
	  multipleQuery();

	}

}
