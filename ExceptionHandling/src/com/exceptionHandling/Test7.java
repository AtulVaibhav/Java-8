package com.exceptionHandling;
//finally
public class Test7 {
   public static void m1(){
	   try{
		   System.out.println(Integer.parseInt("Java"));
	   }finally{
		   System.out.println("finally block executed");
	   }
   }
	public static void main(String[] args) {
		m1();

	}

}
