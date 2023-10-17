package com.exceptionHandling;

import java.util.Scanner;

/**
 * try : code that can cause some exception
 * catch : handle exception
 * finally : code will execute completely
 * throw : explicitly throw exception object
 * throws : propagation of exception object
 *
 */
public class Test4 {
	public static void m1(){
		String str = null;
		System.out.println(str.length());
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter two the number");
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a/b);
			
		}catch(Exception ex){
			System.out.println("Exception handled");
		}
		System.out.println("Code after try-catch block");
	}

	public static void main(String[] args) {
		m1();

	}

}
