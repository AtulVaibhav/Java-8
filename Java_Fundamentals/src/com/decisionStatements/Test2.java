package com.decisionStatements;

import java.util.Scanner;

public class Test2 {
    public static void checkNumber(int num){
    	if(num>0){
    		if(num%2==0){
    			System.out.println(num +" is positive even number");
    		}else{
    			System.out.println(num+" is positive odd number");
    		}
    	}else{
    		System.out.println(num +" is negative");
    	}
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		Test2.checkNumber(num);

	}

}
