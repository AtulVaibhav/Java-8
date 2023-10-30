package com.Set;

import java.util.SortedSet;
import java.util.TreeSet;

//TreeSet  : null is not allowed
//It will sort the value
public class SetImpl_3 {

	public static void main(String[] args) {
		SortedSet<String> set  = new TreeSet<>();
		set.add("Ravi");
		set.add("Amit");
		set.add("Rohan");
		set.add("Kriti");
		set.add("Ravi");
		//set.add(null);
		System.out.println(set);
		
		SortedSet<Integer> set2  = new TreeSet<>();
		set2.add(100);
		set2.add(20);
		set2.add(300);
		set2.add(44);
		set2.add(15);
		System.out.println(set2);
		
	}

}
