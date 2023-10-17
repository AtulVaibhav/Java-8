package com.interfaces;
/**
 * In oreder to provide concrete methods inside interface,methods need to 
 * be declared as 'default'.
 * 
 * Interfaces can contain static methods as well.
 * Static Methods need to be called by using name of interface.
 * 
 * Variables:all variables declared inside interface are public,static 
 * and final by nature.
 * 
 */
interface Vehicle{
	int numberOfWheels = 4;
	
	default void minSpeed(){
		System.out.println("60km/hr");
	}
	public static void brand(){
		System.out.println("Tata Motors");
	}
}
class Bike implements Vehicle{
	
}
public class Test2 {

	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.minSpeed();
		Vehicle.brand();
		System.out.println(Vehicle.numberOfWheels);
		//Vehicle.numberOfWheels = 10;

	}

}
