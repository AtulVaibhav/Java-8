package com.decisionStatements;

import java.util.Scanner;

public class SwitchConcept {

	public static void add() {
		System.out.println("Add is called");
	}

	public static void subtract() {
		System.out.println("subtract is called");
	}

	public static void multiply() {
		System.out.println("multiply is called");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select the option");
		System.out.println("1.add   2.subtract   3.multiply");
		int option = sc.nextInt();
		switch (option) {
		case 1:
			add();
			break;
		case 2:
			subtract();
			break;
		case 3:
			multiply();
			break;
		default:
			System.out.println("Invalid option");
		}

	}

}
