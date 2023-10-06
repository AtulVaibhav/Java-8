package com.decisionStatements;

import java.util.Scanner;

class RegisteredUser{
	 private static final int storedPin = 1243;
	 public static int getPin(){
		 return storedPin;
	 }
}


public class ATM {
	static int amount = 500;
    public static void deposit(Scanner sc){
    	System.out.println("Enter the amount to deposit");
    	int depositAmount = sc.nextInt();
    	if(depositAmount>=500){
    	   amount = amount +depositAmount;
    	   System.out.println("Amount deposited successfully");
    	}else{
    		System.out.println("Minimum amount needs to deposit = 500");
    	}
    }
    
    public static void withdraw(Scanner sc){
    	System.out.println("Enter the amount to withdraw");
    	int withdrawAmount = sc.nextInt();
    	if((amount-500)>=withdrawAmount){
    		System.out.println("Rs."+withdrawAmount+" debited from account");
    	    amount = amount-withdrawAmount;
    	}else{
    		System.out.println("Insufficient bal");
    	}
    	
    }
    
    public static void balEnquiry(){
    	System.out.println(amount);
    	
    }
	public static void main(String[] args) {
		char ans;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to ABC ATM");
		System.out.println("Enter your pin");
		int pin = sc.nextInt();
		if(pin==RegisteredUser.getPin()){
			do{
				System.out.println("Select option");
				System.out.println("1.deposit 2.withdraw  3.balEnq");
				int option = sc.nextInt();
				switch(option){
				case 1:
					deposit(sc);
					break;
					
				case 2:
					withdraw(sc);
					break;
				case 3:
					balEnquiry();
					break;
				default:System.out.println("Invalid option");
				}
				System.out.println("Do you want to continue:y/n");
				ans = sc.next().charAt(0);
			}while(ans=='y');
			
		}else{
			System.out.println("Invalid pin");
		}
		System.out.println("Thanks for using ABC ATM");

	}

}
