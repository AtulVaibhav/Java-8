package com.learning.Hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
  private static  SessionFactory factory = null;
   public static SessionFactory getSessionFactory(){
	   Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
	   factory = cfg.buildSessionFactory();
	   return factory;
   }
   
   //insert
   public static String addStudent(Student student){
	   Session session = getSessionFactory().openSession();
	   session.beginTransaction();
	   session.save(student);
	   session.getTransaction().commit();
	   session.close();
	   factory.close();
	   return "Student saved successfully";
   }
   
   //readById
   public static Student getStudentById(int studentId){
	   Session session = getSessionFactory().openSession();
	   Student student = session.get(Student.class, studentId);
	   if(student==null){
		   return null;
	   }
	   return student;
   }
   
   //readAll
   public static List<Student> getStudents(){
	   Session session = getSessionFactory().openSession();
	   Query query = session.createQuery("from Student");
	   List<Student> list = query.list();
	   if(list.isEmpty()){
		   return null;
	   }
	   return list;
   }
   
   //update
   public static String updateStudent(int studentId,Student newStudent){
	   Session session = getSessionFactory().openSession();
	   Student oldStudent = session.get(Student.class, studentId);
	   session.beginTransaction();
	   oldStudent.setStudentName(newStudent.getStudentName());
	   oldStudent.setCourseEnrolled(newStudent.getCourseEnrolled());
	   session.save(oldStudent);
	   session.getTransaction().commit();
	   return "Student updated successfully";
	   
   }
   
   //delete
   public static String deleteStudent(int studentId){
	   Session session = getSessionFactory().openSession();
	   Student student = session.get(Student.class, studentId);
	   if(student==null){
		   return null;
	   }
	   session.beginTransaction();
	   session.delete(student);
	   session.getTransaction().commit();
	   return "Student deleted successfully";
 
   }
   
   
   
   
   
   
   
   
   
   
}
