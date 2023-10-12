package com.inheritance;

class GP{
	int a = 30;
}

class P extends GP{
	String data="Java";
}

class C extends P{
	float b = 12.45f;
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		C c = new C();
		System.out.println(c.a);
		System.out.println(c.data);
		System.out.println(c.b);

	}

}
