package com.exceptionHandling;
//Single try -Multiple catch
public class Test5 {
	public static void m1(){
		try{
			String str = null;
			System.out.println(str.length());//npe
			System.out.println((12/0));
		}catch(ArithmeticException ae){
			System.out.println("ArithmeticException handled here");
//		}catch(NullPointerException npe){
//			System.out.println("NullPointerException handled here");
//		}
		}catch(NumberFormatException nfe){
			System.out.println("NumberFormatException handled here");
		}catch(Exception ex){
			System.out.println("Any type of exception handled here");
		}
	}

	public static void main(String[] args) {
		m1();

	}

}
