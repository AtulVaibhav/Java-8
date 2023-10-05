package com.decisionStatements;

public class Test {
    public static void gradeSystem(int marks){
    	if(marks>=80){
    		System.out.println("Distinction");
    	}else if(marks>=60 && marks<80){
    		System.out.println("First class");
    	}else if(marks>=35 && marks<60){
    		System.out.println("Second class");
    	}else{
    		System.out.println("Try again");
    	}
    	
    }
    
	public static void main(String[] args) {
		Test.gradeSystem(75);

	}

}
