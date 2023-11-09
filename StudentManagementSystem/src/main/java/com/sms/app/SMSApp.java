package com.sms.app;

import java.sql.SQLException;
import java.util.Scanner;

public class SMSApp {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		char res;
		System.out.println("Welcome to Student-Management-System");
		do{
			System.out.println("Enter the option");
			System.out.println("1.AddStudent  2.GetStudents  3.GetStudent  4.UpdateStudent  5.DeleteStudent");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the id");
				int id = sc.nextInt();
				System.out.println("Enter the name");
				String name = sc.next();
				System.out.println("Enter the course name");
				String course = sc.next();
				System.out.println("Enter the contact number");
				String number = sc.next();
				StudentDetails s1 = new StudentDetails(id, name, course, number);
				System.out.println(JDBCUtil.addStudentDetails(s1));
				break;

			case 2:
				JDBCUtil.getAllStudentDetails();
				break;

			case 3:
				System.out.println("Enter the id");
				int id1 = sc.nextInt();
				JDBCUtil.getStudentById(id1);
				break;

			case 4:
				System.out.println("Enter the id");
				int id3 = sc.nextInt();
				System.out.println("Enter the name");
				String name3 = sc.next();
				System.out.println("Enter the course name");
				String course3 = sc.next();
				System.out.println("Enter the contact number");
				String number3 = sc.next();
				StudentDetails s2 = new StudentDetails(id3, name3, course3, number3);
				System.out.println(JDBCUtil.updateStudent(id3, s2));
				break;

			case 5:
				System.out.println("Enter the id");
				int id4 = sc.nextInt();
				System.out.println(JDBCUtil.deleteStudent(id4));
				break;

			default:
				System.out.println("Invalid option");

			}
			
		  System.out.println("Do you want to continue ? y/n");
		  res = sc.next().charAt(0);
		}while(res=='y');

		System.out.println("Thank You!!!");

	}

}
