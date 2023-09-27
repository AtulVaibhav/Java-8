package com.fundamentals;

public class InstanceBlock {
    //IIB
	{
		System.out.println("Object created successfully");
	}
	public static void main(String[] args) {
		InstanceBlock ib = new InstanceBlock();
		InstanceBlock ib2 = new InstanceBlock();
	}

}
