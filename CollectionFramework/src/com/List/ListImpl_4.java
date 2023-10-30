package com.List;

import java.util.Stack;
import java.util.Vector;

//Stack
public class ListImpl_4 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		System.out.println("Capacity :"+stack.capacity());
		
		//add elements
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println(stack);
		
		//to get head element
		
		System.out.println("Head element :"+stack.peek());
		System.out.println(stack);
		
		//to remove element
		System.out.println("Remove first element :"+stack.pop());
		System.out.println(stack);
		System.out.println("Head element :"+stack.peek());
		
		for(int i=30;i<=70;i=i+10){
			stack.push(i);
		}
		System.out.println(stack);
		
		//capacity
		System.out.println(stack.capacity());
		
		//ensureCapacity
		
		Stack<Integer> stack2 = new Stack<>();
		stack2.ensureCapacity(30);
		System.out.println(stack2.capacity());
		System.out.println(stack2);
		//check stack is empty or not
		System.out.println(stack.isEmpty());
		System.out.println(stack2.isEmpty());
		
	}

}
