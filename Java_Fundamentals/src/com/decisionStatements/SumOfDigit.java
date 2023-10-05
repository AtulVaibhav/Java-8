package com.decisionStatements;

public class SumOfDigit {
    public static void sumOfDigits(int num){
    	int sum = 0;
    	while(num>0){
    		int rem = num%10;
    		int quo = num/10;
    		num = quo;
    		sum = sum +rem;	
    	}
    	System.out.println("Sum of digits :"+sum);
    	
    }
	public static void main(String[] args) {
		int number = 1234;// 4+3+2+1
		sumOfDigits(number);
	}

}
//wap to reverse a number
//wap to check number is palindrom or not
