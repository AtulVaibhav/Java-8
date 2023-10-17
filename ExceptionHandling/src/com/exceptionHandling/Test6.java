package com.exceptionHandling;
//Nested try-catch
public class Test6 {
    
	public static void m1(){
		try{
			System.out.println("In outer-try block");
			String str = "Java";
			System.out.println(str.length());
			try{
				System.out.println("Inside inner-try block");
				System.out.println(12/0);
//			}catch(ArithmeticException ae){
//				System.out.println("Exception handled in inner-catch block");
//			}
			}catch(NullPointerException npe){
				System.out.println("Exception handled in inner-catch block");
			}
		}catch(Exception ex){
			System.out.println("Exception handled in outer-catch block");
		}
	}
	public static void main(String[] args) {
		m1();

	}

}
