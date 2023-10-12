package com.inheritance;

class Parent{
	int a = 20;
	Parent(){
		System.out.println("Parent constructor");
	}
}

class Child extends Parent{
	//inside constructor , super must be first statement to be executed.
	Child(){
		super();
		System.out.println("Child constructor");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		Child ch = new Child();
		System.out.println(ch.a);

	}

}
