package com.inheritance;

class A{
	int a = 10;
}

class B extends A{
	int b=20;
}

class C1 extends A{
	int c = 30;
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		B obj = new B();
		System.out.println(obj.a);
		System.out.println(obj.b);
		//System.out.println(obj.c);

	}

}
