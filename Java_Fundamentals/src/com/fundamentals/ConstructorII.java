package com.fundamentals;


class Student{
	int id;
	String name;
	
	//Parameterized constructor
	Student(int studentId,String studentName){
		id = studentId;
		name = studentName;
	}	
	public void show(){
		System.out.println("id: "+id+" name: "+name);
	}
}

public class ConstructorII {

	public static void main(String[] args) {
	 Student s1 = new Student(100,"Rahul");
	 Student s2 = new Student(102,"Amit");
	 s1.show();
	 s2.show();

	}

}
