package com.polymorphism;
/**overloading :
 * functions have same name
 * number of arguments must be different
 * if number of args is same,then type must be different
 * overloading doesn't depend on return type
 * 
 * 
 * 
 *
 */

class Dimension{
	public void area(){
		System.out.println("Area is calculated");
	}
	
	public void area(double radius){
		System.out.println("Area of circle :"+(Math.PI*radius*radius));
	}
	
	public void area(int side){
		System.out.println("Area of Square :"+(side * side));
	}
}


public class Test1 {

	public static void main(String[] args) {
		Dimension d = new Dimension();
		d.area();
		d.area(12.45);
		d.area(13);

	}

}
