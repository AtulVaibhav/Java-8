package com.exceptionHandling;
//RuntimeException:Unchecked
public class Test3 {
    public static void m1(){
    	//ArithmeticException
    	System.out.println(12/0);
    }
    
    public static void m2(){
    	//NullPointerException
    	String str = null;
    	System.out.println(str.length());
    }
    
    public static void m3(){
    	//NumberFormatException
    	String str = "123efg";
    	System.out.println(Integer.parseInt(str));
    }
    
    public static void m4(){
    	//ArrayIndexOutOfBound
    	int[] arr= {1,2,3};
    	System.out.println(arr[3]);
    }
    
    public static void m5(){
    	//StringIndexOutOfBound
    	String str = "Java";
    	System.out.println(str.charAt(4));
    }
	public static void main(String[] args) {
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();

	}

}
