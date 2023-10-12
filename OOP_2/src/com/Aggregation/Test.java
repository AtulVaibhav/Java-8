package com.Aggregation;

public class Test {

	public static void main(String[] args) {
		Address addr = new Address("Bangalore","Karnataka","India");
		Employee emp = new Employee(101,"Harsh",addr);
//		System.out.println(emp.id);
//		System.out.println(emp.name);
//		System.out.println(emp.address.city);
//		System.out.println(emp.address.state);
//		System.out.println(emp.address.country);
		System.out.println(emp);

	}

}
