package com.fundamentals;

public class FunctionII {
	int a = 100;
	static int b =200;
	
	//non-static
	public void display(){
		System.out.println(a);
		System.out.println(b);
	}
	
	//static function
	public static void show(){
		//System.out.println(a);
		System.out.println(b);
	}
	

	public static void main(String[] args) {
		FunctionII obj = new FunctionII();
		obj.display();
		FunctionII.show();
		

	}

}
/**class Employee
 * id=101
 * name="Arjun"
 * companyName="xyz"
 * 
 * display(): id  name companyName
 * 
 * 
 * 
 * 
 */

