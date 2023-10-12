package com.Aggregation;

public class Employee {
    int id;
    String name;
    Address address;
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
    
	@Override
	public String toString(){
		return "EmployeeId:"+this.id+" EmployeeName :"+this.name+
				" EmployeeAddress :"+this.address;
	}
    
}
