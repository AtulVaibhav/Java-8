package com.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//ArrayList

public class ListImpl {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		//add
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(30);
		list.add(50);
		
		System.out.println(list);
		
		
		//access an item :get(index)
		System.out.println(list.get(3));
		
		
		//change  an item :set
		list.set(3, 100);
		System.out.println(list);
		
		// remove 
	     System.out.println(list.remove(4));
	     System.out.println(list);
	     
	     
	   // get the size:size()
	     System.out.println(list.size());
	     
	     
	    // Traverse:
	     //1.Enhanced for loop
	     for(Integer obj:list){
	    	 System.out.println(obj);
	     }
	     
	     //2.Using Iterator
	     Iterator<Integer> itr = list.iterator();
		 while(itr.hasNext()){
			 System.out.println(itr.next());
		 }
		 
		 // sort
		 List<String> list2 = new ArrayList<>();
		 list2.add("Vivek");
		 list2.add("Rahul");
		 list2.add("Aman");
		 list2.add("Amit");
		 list2.add("Jai");
		 
		 Collections.sort(list2);
		 System.out.println(list2);
		 
		 
		

	}

}
