package com.decisionStatements;

import java.util.Scanner;

class storedUser{
	public static final  int storedUsername=123;
	public static final int  storedPassword = 7856;
}
public class LoginSystem {
    public static void signIn(int username,int password){
    	if(storedUser.storedUsername==username){
    		if(storedUser.storedPassword==password){
    		      System.out.println("Welcome user");	
    		}else{
    			System.out.println("Invalid password");
    		}
    	}else{
    		System.out.println("Invalid username");
    	}
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the username");
		int username = sc.nextInt();
		System.out.println("Enter the password");
		int password = sc.nextInt();
		LoginSystem.signIn(username, password);

	}

}
