package com.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueImpl {

	public static void main(String[] args) {
		//Offer
		Queue<Integer> queue = new PriorityQueue<>();
		queue.offer(41);
		queue.offer(22);
		queue.offer(34);
		
		//head of queue: element()
		System.out.println("Head of the queue:"+queue.element());
		
		System.out.println(queue);
		
		//peek(): return head of queue
		Queue<Integer> queue2 = new PriorityQueue<>();
		System.out.println(queue2.isEmpty());
		//System.out.println(queue2.element());
		System.out.println(queue2.peek());
		
		
		//remove: return and remove head element
		System.out.println(queue.remove());
		System.out.println(queue.element());
		
		//remove:throw exception if queue is empty
		//System.out.println(queue2.remove());
		
		//poll: return null if queue is empty,otherwise return and remove 
		//head element
		
		System.out.println(queue.poll());
		System.out.println(queue2.poll());
		
		
		
	}

}
