package com.fundamentals;

public class Operators {
	//Arithmetic Operator :+,-,*,%,/
	public static void arithmeticOperators(){
		int a = 10;
		int b = 6;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a%b); // % = remainder
		System.out.println(a/b); //  / = quotient
	}
	
	//Unary Operators : ++(+1) ,--(-1)
	public static void unaryOperators(){
		//Pre-Increment or Pre-Decrement:first increment then assign
		
		int a = 10;
		int b = ++a;
		// a  = a+1;10+1
		//b = a
		System.out.println(a+" "+b);
		
		//Post-increment or post-decrement : first assign then increment
		int c = 20;
		int d = c++;
		//d = c
		//c = c+1;
		System.out.println(c+" "+d);
		
	}
	//Relational Operators:>, <,>= ,<=, == : boolean
	public static void relationalOperators(){
		int a = 30;
		int b = 40;
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a!=b);
	}
	
	//Logical Operators:&&(AND), ||(OR), !(NOT)
	public static void logicalOperators(){
		boolean a = true;
		boolean b = false;
		System.out.println(a && b);
		System.out.println(a || b);
		System.out.println(!a);
	}
	
	//Ternary Operator
	public static void ternaryOperator(){
		//condition ?(if true) a: (if false)b
		int a = 10;
		int b = 20;
		
		int result = (a>b)? 100:200; 
		System.out.println(result);
		
	}
	//Shift Operator: LeftShift(X2)<<, RightShift(/2)>>
	public static void shiftOperators(){
		int a = 20;
		int b = 30;
		System.out.println(a<<1);
		System.out.println(b>>1);
	}
	
	//Bitwise Operators: & ,|, ~ ,^
	public static void bitwiseOperators(){
		int a = 10; // 1010
		int b = 5;  // 0101
		            //  --------
		            // 0000
		            // 1111
		System.out.println(a&b);
		System.out.println(a|b);
		
		// ~a = -(a+1)
		System.out.println(~a);
		//if bits are different then return true,otherwise false
		System.out.println(a^b);
	}
	
	//instanceof Operator
	public static void instanceOperator(){
		String obj = "Java";
		System.out.println(obj instanceof String);
	}
    
	public static void main(String[] args) {
		Operators.arithmeticOperators();
		Operators.unaryOperators();
		Operators.relationalOperators();
		Operators.logicalOperators();
		Operators.ternaryOperator();
		Operators.shiftOperators();
		Operators.bitwiseOperators();
		Operators.instanceOperator();

	}

}
