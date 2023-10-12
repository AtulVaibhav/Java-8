package com.pack1;

public class Test {

	public static void main(String[] args) {
		A obj = new A();
		System.out.println(obj.a);
		System.out.println(obj.b);
		//System.out.println(obj.c);
		obj.show();
		
		Child ch = new Child();
		System.out.println(ch.d);
	}

}
/**
default : we can access default variables with same package
          we can't access default variables outside package
          
public  : we can access public variables with same package
          we can access public variables outside package

private : we can access private variables with same class.
          we can't access outside class.

protected :  within same package child class can access protected data.
             outside package child class can't access protected data.
*/
