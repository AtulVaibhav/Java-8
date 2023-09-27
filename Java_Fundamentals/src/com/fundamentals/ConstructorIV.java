package com.fundamentals;

import java.util.Scanner;

class Shape{
	int numberOfSides;
	String shapeName;	
	
	Shape(int sides, String name ){
		numberOfSides = sides;
		shapeName = name;
	}
	
	Shape(Shape obj){
		System.out.println("Copy constructor called");
		numberOfSides =obj.numberOfSides ;
		shapeName = obj.shapeName;
	}
	
	
	public void show(){
		System.out.println("Sides :"+numberOfSides+" Name:"+shapeName);
	}
	
}


public class ConstructorIV {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of sides");
		int sides = sc.nextInt();
		System.out.println("Enter the name");
		String name = sc.next();
		
		Shape obj = new Shape(sides,name);
		obj.show();
		
		System.out.println("Creating 2nd object");
		Shape obj2 = new Shape(obj);
		obj2.show();

	}

}
