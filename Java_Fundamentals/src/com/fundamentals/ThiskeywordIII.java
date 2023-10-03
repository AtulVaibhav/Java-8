package com.fundamentals;
//2.to call one constructor from another constructor(Constructor Chaining)
class Data{
	Data(){
		System.out.println("Default constructor is called");
	}
	Data(String a){
		this();//constructor with zero-arg
		System.out.println("Parameterized constructor is called");
	}
}

public class ThiskeywordIII {

	public static void main(String[] args) {
		Data obj = new Data("Harsh");

	}

}
