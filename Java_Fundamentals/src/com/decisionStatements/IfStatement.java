package com.decisionStatements;

public class IfStatement {
    public static void positiveNumber(int num){
    	if(num>0){
    		System.out.println("Positive number");
    	}
    }
    
    public static void checkNumber(int num){
    	if(num%2==0){
    		System.out.println(num+" is an even number");
    	}else{
    		System.out.println(num+" is an odd number");
    	}
    }
    
    public static void ageVerification(int age){
    	if(age>=18){
    		System.out.println("Welcome to online voting");
    	}else{
    		System.out.println("Age Verification failed");
    	}
    }
	public static void main(String[] args) {
		 IfStatement.positiveNumber(-12);
		 IfStatement.checkNumber(23);
		 IfStatement.ageVerification(17);

	}

}
