package com.List;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//LinkedList
public class ListImpl_2 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		//add
		list.add(20);
		list.add(40);
		list.add(60);
		list.add(80);
		System.out.print("Head--->");
		for(Integer obj: list){
			System.out.print(obj+"======");
		}
		System.out.println("null");
		
		//get first node
		System.out.println(list.getFirst());
        
		//add new node at beginning
		list.addFirst(10);
		System.out.print("Head--->");
		for(Integer obj: list){
			System.out.print(obj+"======");
		}
		System.out.println("null");
		
		
		// add node at given position
		list.add(3, 100);
		System.out.print("Head--->");
		for(Integer obj: list){
			System.out.print(obj+"======");
		}
		System.out.println("null");
		
		//add node at the end 
		list.addLast(120);
		
		System.out.print("Head--->");
		for(Integer obj: list){
			System.out.print(obj+"======");
		}
		System.out.println("null");
		
		
		//find the length
		System.out.println(list.size());
		
		//sort
		Collections.sort(list);
		System.out.print("Head--->");
		for(Integer obj: list){
			System.out.print(obj+"======");
		}
		System.out.println("null");
		
		//middle element
		if(list.size()%2==1){
			System.out.println(list.get(list.size()/2));
		}
		
		list.add(4, 200);
		Collections.sort(list);
		System.out.print("Head--->");
		for(Integer obj: list){
			System.out.print(obj+"======");
		}
		System.out.println("null");
		
		if(list.size()%2==0){
			System.out.println(list.get((list.size())/2));
		}
		
		
		//element is present or not:contains
		int num =80;
		if(list.contains(num)){
			System.out.println(list.set(list.indexOf(num), 180));
			
		}
		System.out.print("Head--->");
		for(Integer obj: list){
			System.out.print(obj+"======");
		}
		System.out.println("null");
		
		
		//remove
		list.remove(1);
		System.out.print("Head--->");
		for(Integer obj: list){
			System.out.print(obj+"======");
		}
		System.out.println("null");
		
		
	    
		
		
		
	}

}
