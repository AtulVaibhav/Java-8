package com.fundamentals;

public class Functions {
	
	//function definition
    public void greet(){
    	System.out.println("Good morning");
    }
    public void greetPerson(String name){
    	System.out.println("Good morning "+name);
    }
    
    public void add(int num1,int num2){
    	System.out.println(num1+num2);
    }
    
    
	public static void main(String[] args) {
		Functions obj = new Functions();
		obj.greet();//invoking a function
		obj.greetPerson("Rahul");
		obj.add(12, 13);

	}

}
