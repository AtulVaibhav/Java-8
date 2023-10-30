package com.Queue.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeImpl {

	public static void main(String[] args) {
		Deque<Integer> deque = new ArrayDeque<>();
		for(int i=10;i<=15;i++){
			deque.offer(i);
		}
		System.out.println(deque);
		System.out.println("Head element:"+deque.element());
		
		
		
		//addFirst:add element from front end
		deque.addFirst(5);
		System.out.println(deque);
		System.out.println("Head element:"+deque.element());
		
		// addLast
		deque.addLast(20);
		System.out.println(deque);
		
		//peekFirst
		System.out.println(deque.peekFirst());
		
		//peekLast
		System.out.println(deque.peekLast());
		
		
		//pollFirst
		System.out.println(deque.pollFirst());
		System.out.println(deque);
		
		//pollLast
		System.out.println(deque.pollLast());
		System.out.println(deque);
		
		
	}

}
