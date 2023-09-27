package com.fundamentals;

class Dimension{
	Dimension(){
		System.out.println("default constructor is called");
	}
	{
		System.out.println("IIB block executed");
	}
	static{
		System.out.println("static block is called");
	}
}
//static > constructor > IIB

public class StaticBlock2 {
	public static void main(String[] args) {
		Dimension dimension = new Dimension();

	}
}
