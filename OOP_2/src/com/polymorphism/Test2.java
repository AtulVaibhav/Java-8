package com.polymorphism;
/**
 * giving new implementation in child class
 * method signature must be same in parent class as well as in child class
 * 
 * non-static method always depend on type of object 
 *
 */

class Vehicle{
	public void speed(){
		System.out.println("100km/hr");
	}
}

class Bike extends Vehicle{
	@Override
	public void speed(){
		System.out.println("130km/hr");
	}
}

public class Test2 {

	public static void main(String[] args) {
		//reference type is same of obj type
		  Vehicle v = new Vehicle();
		  v.speed();
		  
		  Bike bike = new Bike();
		  bike.speed();
		
		
		//reference type is different of obj type
		  //when parent type reference points child type object,it's
		  // called Dynamic Dispatch
		  
		 Vehicle v2 =new Bike();
		 v2.speed();

	}

}
