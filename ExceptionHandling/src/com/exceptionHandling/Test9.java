package com.exceptionHandling;

class AgeVerificationFailedException extends RuntimeException{
	String msg;
	AgeVerificationFailedException(String msg){
		this.msg = msg;
	}
	public String getMessage(){
		return this.msg;
	}
}
public class Test9 {
    public static void onlineVoting(int age){
    	if(age<18){
    		try{
    			throw new AgeVerificationFailedException("Age verification failed");
    		}catch(AgeVerificationFailedException e){
    			System.out.println(e.getMessage());
    			
    		}
    	}else{
    		System.out.println("Welcome to Online Voting System");
    	}
    }
	public static void main(String[] args) {
		onlineVoting(17);
	}

}
