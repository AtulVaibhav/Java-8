package com.fundamentals;

class Box{
	Box(){
		{
			System.out.println("IIB block executed");
		}
		System.out.println("Constructor called");
	}
	
}


public class IIBII {

	public static void main(String[] args) {
		Box box = new Box();

	}

}
