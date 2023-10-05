package com.decisionStatements;

public class RightAngledTriangle {
    public static void showRightAngledTriangle(int num){
    	for(int i=1;i<=num;i++){
    		for(int j=1;j<=i;j++){
    			System.out.print(" * ");
    		}
    		System.out.println();
    	}
    }
	public static void main(String[] args) {
		showRightAngledTriangle(6);
	}

}
//wap to print reverse of right-angled triangle
