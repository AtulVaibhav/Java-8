package com.sms.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCUtil {
	private static final String url="jdbc:mysql://localhost:3306/jdbc";
	private static final String user ="root";
	private static final String password ="root";
	
   // get connection object
	public static Connection getConnection(){
		 Connection con = null;
	try{
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(url,user,password);
		if(con==null){
			return null;
		}
	}catch(Exception e){
		e.printStackTrace();
	}
		return con;
	}
	
   // saving student object
	public static String addStudentDetails(StudentDetails student) throws SQLException{
		PreparedStatement preparedStatement = getConnection()
				.prepareStatement("insert into student_details(studentId,studentName,courseEnrolled,contact) values(?,?,?,?)");
		preparedStatement.setInt(1,student.getStudentId());
		preparedStatement.setString(2,student.getStudentName());
		preparedStatement.setString(3,student.getCourseEnrolled());
		preparedStatement.setString(4,student.getContact());
		
		int i = preparedStatement.executeUpdate();
		if(i<0){
			return "Student details not saved";
		}
		return "Student details saved successfully";	
	}
  
   // getting all records
	public static void getAllStudentDetails() throws SQLException{
		PreparedStatement preparedStatement = getConnection()
				.prepareStatement("select * from student_details");
		ResultSet resultSet = preparedStatement.executeQuery();
		System.out.println("Details of Students");
		System.out.println("_____________________________");
		while(resultSet.next()){
			System.out.println("StudentID:"+resultSet.getInt(1));
			System.out.println("Student_Name:"+resultSet.getString(2));
			System.out.println("CourseEnrolled:"+resultSet.getString(3));
			System.out.println("Contact_Number:"+resultSet.getString(4));
			System.out.println("_____________________________");
		}
	}
  
   // get student by Id
   public static void getStudentById(int studentId) throws SQLException{
	   PreparedStatement preparedStatement = getConnection()
			   .prepareStatement("select * from student_details where studentId=?");
       
       preparedStatement.setInt(1,studentId);
       ResultSet resultSet = preparedStatement.executeQuery();
       if(resultSet==null){
    	   try {
				throw new NoStudentFoundException("No student found with studentId:"+studentId);
			} catch (NoStudentFoundException e) {
				System.out.println(e.getErrorMsg());
			}
       }
       System.out.println("Details of Student");
		System.out.println("_____________________________");
    	   while(resultSet.next()){
   			System.out.println("StudentID:"+resultSet.getInt(1));
   			System.out.println("Student_Name:"+resultSet.getString(2));
   			System.out.println("CourseEnrolled:"+resultSet.getString(3));
   			System.out.println("Contact_Number:"+resultSet.getString(4));
   			System.out.println("_____________________________");
   		}
       }
   
	
   //update existing student
	public static String updateStudent(int studentId,StudentDetails student) throws SQLException{
		PreparedStatement preparedStatement = getConnection()
				.prepareStatement("update student_details set studentName=?,courseEnrolled=?,contact=? where studentId=?");
		preparedStatement.setString(1,student.getStudentName());
		preparedStatement.setString(2, student.getCourseEnrolled());
		preparedStatement.setString(3, student.getContact());
		preparedStatement.setInt(4, student.getStudentId());
		
		int i = preparedStatement.executeUpdate();
		if(i<=0){
			try {
				throw new NoStudentFoundException("No student found with studentId:"+studentId);
			} catch (NoStudentFoundException e) {
				return e.getErrorMsg();
			}
		}
		return "Student details updated successfully";
	}
	
  
   //delete student
	public static String deleteStudent(int studentId) throws SQLException{
		PreparedStatement preparedStatement = getConnection()
				.prepareStatement("delete from student_details where studentId=?");
		preparedStatement.setInt(1, studentId);
		int i = preparedStatement.executeUpdate();
		if(i<=0){
			try {
				throw new NoStudentFoundException("No student found with studentId:"+studentId);
			} catch (NoStudentFoundException e) {
				return e.getErrorMsg();
			}
		}
		return "Student details deleted successfully";
	}
	
}
