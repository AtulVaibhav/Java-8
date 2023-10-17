package com.interfaces;
/**
 * interface is a keyword
 * collection of abstract methods
 * by default, all the methods declared inside interface are public,abstract in nature.
 * We can't create an object of interface.
 * interfaces need to be implemented(keyword:implements)
 */

interface Account{
	 void calculateSalary();
}

class FTE implements Account{
	public void calculateSalary(){
		System.out.println("Salary :"+(1000*30));
	}
}

class PTE implements Account{
	public void calculateSalary(){
		System.out.println("Salary :"+(500*30));
	}
}

public class Test {

	public static void main(String[] args) {
		FTE fte = new FTE();
		fte.calculateSalary();
		
		PTE pte = new PTE();
		pte.calculateSalary();

	}

}
