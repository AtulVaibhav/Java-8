package com.exceptionHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student{
	private int studentId;
	private String studentName;
	private String courseEnrolled;
	public Student(int studentId, String studentName, String courseEnrolled) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.courseEnrolled = courseEnrolled;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCourseEnrolled() {
		return courseEnrolled;
	}
	public void setCourseEnrolled(String courseEnrolled) {
		this.courseEnrolled = courseEnrolled;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", courseEnrolled=" + courseEnrolled
				+ "]";
	}
	
	
}


class StudentNotFoundException extends RuntimeException{
	private String message;
	StudentNotFoundException(String message){
		this.message = message;
	}
	
	public String getMessage(){
		return this.message;
	}
}

public class Test10 {

	static List<Student> listOfStudents;
	static{
		Student s1 = new Student(101,"Harsh","Java");
		Student s2 = new Student(102,"Vivek","Java2EE");
		Student s3 = new Student(103,"Rahul","Networking");
		Student s4 = new Student(104,"Raj","WebDevelopment");
		Student s5 = new Student(105,"Ajay","Java");
		Student s6 = new Student(106,"Pawan","Digital Marketing");
		Student s7 = new Student(107,"Vishal","Python");
		
		listOfStudents = new ArrayList<>();
		listOfStudents.add(s1);
		listOfStudents.add(s2);
		listOfStudents.add(s3);
		listOfStudents.add(s4);
		listOfStudents.add(s5);
		listOfStudents.add(s6);
		listOfStudents.add(s7);
	}
   
	
	public static void getStudentById(int id){
		boolean isFound = false;
		 for(int i=0;i<listOfStudents.size();i++){
			 if(id==listOfStudents.get(i).getStudentId()){
				 isFound = true;
				 System.out.println(listOfStudents.get(i));
				 break;
			 }
		 }
		 if(isFound){
			 System.out.println("StudentFound");  
		 }else{
			 try{
				throw new StudentNotFoundException("Student doesn't exist");
			 }catch(StudentNotFoundException e){
				 System.out.println(e.getMessage());
			 }
		 }
		 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student id");
		int id = sc.nextInt();
		getStudentById(id);

	}

}
