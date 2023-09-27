package com.fundamentals;

public class DataTypes {
	byte a;
	short b;
	int c;
	long d;
	float f;
	double g;
	char ch;
	boolean flag;
	

	public static void main(String[] args) {
		System.out.println("Max value for bytes:"+Byte.MAX_VALUE);
		System.out.println("Min value for bytes:"+Byte.MIN_VALUE);
		
		System.out.println("Max value for short:"+Short.MAX_VALUE);
		System.out.println("Min value for short:"+Short.MIN_VALUE);
		
		System.out.println("Max value for int:"+Integer.MAX_VALUE);
		System.out.println("Min value for int:"+Integer.MIN_VALUE);
		
		System.out.println("Max value for long:"+Long.MAX_VALUE);
		System.out.println("Min value for long:"+Long.MIN_VALUE);
		
		System.out.println("Max value for float:"+Float.MAX_VALUE);
		System.out.println("Min value for float:"+Float.MIN_VALUE);
		
		System.out.println("Max value for double:"+Double.MAX_VALUE);
		System.out.println("Min value for double:"+Double.MIN_VALUE);
		
		DataTypes obj = new DataTypes();
		System.out.println("Default value of byte "+obj.a);
		System.out.println("Default value of short "+obj.b);
		System.out.println("Default value of int "+obj.c);
		System.out.println("Default value of long "+obj.d);
		System.out.println("Default value of float "+obj.f);
		System.out.println("Default value of double "+obj.g);
		//System.out.println("Default value of char"+obj.ch);
		System.out.println("Default value of boolean "+obj.flag);
		
		
		
	}

}
