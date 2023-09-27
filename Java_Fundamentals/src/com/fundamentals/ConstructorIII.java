package com.fundamentals;
import java.util.Scanner;
class Vehicle{
	int modelNumber;
	String vehicleName;
	String vehicleColor;
	
	Vehicle(int model,String name, String color){
		modelNumber = model;
		vehicleName = name;
		vehicleColor = color;
	}
	public void showData(){
		System.out.println("modelNumber :"+modelNumber);
		System.out.println("vehicleName :"+vehicleName);
		System.out.println("vehicleColor :"+vehicleColor);
	}
	
}


public class ConstructorIII {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the vehicle model number :");
        int modelNumber = sc.nextInt();//take input of int type
        
        System.out.println("Enter the vehicle name :");
        String vehicleName = sc.next();//take input of String type
        
        System.out.println("Enter the vehicle color:");
        String vehicleColor = sc.next();
        
        Vehicle obj = new Vehicle(modelNumber ,vehicleName,vehicleColor);
        obj.showData();
        
        
        
	}

}
