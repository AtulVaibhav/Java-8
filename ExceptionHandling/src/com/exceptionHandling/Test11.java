/**
 * throws : exception declaration
 * 
 */


package com.exceptionHandling;

class IdNotFoundException extends Exception{

}
public class Test11 {
     public static void m1(int id) throws IdNotFoundException {
    	 if(id!=102){
    		 throw new IdNotFoundException();
    	 }else{
    		 System.out.println("Id found");
    	 }
     }
	public static void main(String[] args) throws IdNotFoundException {
		
			m1(103);
		
	}

}
