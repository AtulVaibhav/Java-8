package com.Stream;
//Functional Interface:interface having exactly one abstract method
//Runnable, Comparable

@FunctionalInterface
interface Vehicle{
	//void speed();	//public
	
	//  String getMsg();
	
	//void getAdd(int a , int b);
	
	//String greet(String name);
	
	int addElements(int[] arr);
	
}


public class Test {

	public static void main(String[] args) {

//		Vehicle v = ()->{System.out.println("Max speed :150km/hr");};
//		v.speed();	
		
//		Vehicle v1 = ()->{return "Good Morning";};
//		System.out.println(v1.getMsg());
		
//		Vehicle v2 = (a,b)-> System.out.println(a+b);
//        v2.getAdd(12, 13);
		
//		Vehicle v3 = (name)->{ return "Good Morning "+name;};
//		System.out.println(v3.greet("Rahul"));
		
//		int[] arr = {1,2,3,4,5};
//		Vehicle v3 = (arr2) -> {
//			int sum = 0;
//			for (int ele : arr2) {
//				sum += ele;
//			}
//			return sum;
//		};
//		
//		System.out.println(v3.addElements(arr));
	}

}
