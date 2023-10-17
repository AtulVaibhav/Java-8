package com.abstrctclass;
//Abstraction is achieved by abstract keyword.
//If a class is having even a single abstract method, then class must be
// declared as abstract
//abstract method: which doesnot have body(functionality)
//concrete method: which have body(functionality:{})
//Abstract classes can't be instantiated(creating an object)

abstract class Vehicle{
	public abstract void speed();
	public void brand(){
		System.out.println("Tata Motors");
	}	
}

class Bike extends Vehicle{
	public void speed(){
		System.out.println("120km/hr");
	}
}


abstract class TwoWheeler{
	public void speed(){
		System.out.println("120km/hr");
	}
	public void brand(){
		System.out.println("Hero");
	}
}


public class Test {

	public static void main(String[] args) {
		//Vehicle v = new Vehicle();
		Bike bike = new Bike();
		bike.speed();
		bike.brand();
		
		//TwoWheeler twoWheeler = new TwoWheeler();

	}

}
// what's difference between abstract class and interface?
