package com.decisionStatements;

public class BreakCode {

	public static void main(String[] args) {
	 for(int i=1;i<=10;i++){
		 if(i==6){
			 break;
		 }
		 System.out.println(i);
	 }
	 
	 //nested loop
	 System.out.println("---------------------------");
	 for(int i=1;i<=5;i++){
		 for(int j=1;j<=5;j++){
			 if(j==4){
				 break;
			 }
			 System.out.println(i+" "+j);
		 }
	 }
	 
	}

}
