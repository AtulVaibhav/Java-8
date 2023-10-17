package com.exceptionHandling;
//throw
public class Test8 {
    public static void getValue(int a,int b){
    	if(b==0){
    		try{
    		throw new ArithmeticException();
    		}catch(Exception e){
    			System.out.println("You can't enter value of b==0");
    		}
    	}else{
    		System.out.println(a/b);
    	}
    }
	public static void main(String[] args) {
		getValue(12, 0);
	}

}
