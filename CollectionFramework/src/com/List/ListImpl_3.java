package com.List;

import java.util.Vector;

//Vector:synchronized(thread-safe)

public class ListImpl_3 {

	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>();
		for(int i=10;i<=15;i++){
			vector.add(i);
		}
		System.out.println(vector);
		
		//access aan item
		System.out.println(vector.get(1));
		
		//change an item
		vector.set(1,21);
		System.out.println(vector);
		System.out.println(vector.size());
		
		
		//remove
		vector.remove(1);
		System.out.println(vector);
		System.out.println(vector.size());
		
		

	}

}
