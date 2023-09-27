package com.fundamentals;

public class StaticBlock {
	//static block
   static{
	   System.out.println("static block executed");
   }
   
   //instance initialization block
   {
	   System.out.println("instance block executed");
   }
	public static void main(String[] args) {
		StaticBlock sb = new StaticBlock();
		StaticBlock sb1 = new StaticBlock();
	}

}
