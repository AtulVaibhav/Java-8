package com.fundamentals;

public class Variables {
	//instance variable
	int a = 10;
	
	
	//static variable
	static int b = 20;

	public static void main(String[] args) {
		// creating an object :ClassName objName = new ClassName();
		//accessing instance variable using object
		Variables obj = new Variables();
		System.out.println(obj.a);
		Variables obj2 = new Variables();
		System.out.println(obj2.a);
		
		//accessing static variable using classname
		System.out.println(Variables.b);
		//System.out.println(obj.b);
		
		//local variable
		int c = 20;
		System.out.println(c);
		

	}

}
