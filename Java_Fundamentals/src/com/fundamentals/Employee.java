package com.fundamentals;

public class Employee {
	int id=101;
	String name = "Arjun";
	String companyName = "XYZ";
	
	public void display(){
		System.out.println(id);
		System.out.println(name);
		System.out.println(companyName);
	}

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.display();

	}

}
//constructor
