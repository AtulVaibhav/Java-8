package com.learning.Hibernate;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res;
		do{
		System.out.println("Enter the option");
		System.out.println("1.AddStudent  2.GetById   3.GetAll   4.UpdateStudent 5.DeleteStudent");
        int choice = sc.nextInt();
        switch(choice){
        case 1:System.out.println("Enter the student name");
               String name = sc.next();
               System.out.println("Enter the course name");
               String course = sc.next();
               Student newStudent = new Student(name,course);
        	   String msg = HibernateUtil.addStudent(newStudent);
        	   System.out.println(msg);
        	   break;
        case 2:System.out.println("Enter the id of the student");
               int id = sc.nextInt();
               Student student = HibernateUtil.getStudentById(id);
               System.out.println(student);
               break;
               
        case 3: List<Student> list = HibernateUtil.getStudents();
                System.out.println(list);
                break;
                
        case 4: System.out.println("Enter the id of student you want to update");
                int updateId = sc.nextInt();
                System.out.println("Enter the name of the student");
                String newName = sc.next();
                System.out.println("Enter the course of the student");
                String newCourse = sc.next();
                Student updatedStudent = new Student(newName,newCourse);
                String result = HibernateUtil.updateStudent(updateId, updatedStudent);
                System.out.println(result);
                break;
                
                
        case 5:  System.out.println("Enter the id of student you want to delete");
                 int searchId = sc.nextInt();
                 String deleteMsg = HibernateUtil.deleteStudent(searchId);
                 System.out.println(deleteMsg);
                 break;
                 
        default:System.out.println("Enter the correct option");
        }
        System.out.println("Do you want to continue?- y/n");
        res = sc.next().charAt(0);
		}while(res=='y');
		
		System.out.println("Thanks.Happy Coding!!");
	}

}
