package com.Set;

import java.util.HashSet;
import java.util.Set;


//HashSet : Insertion order is not maintained
//null is allowed
public class SetImpl_1 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Ravi");
		set.add("Amit");
		set.add("Rohan");
		set.add("Kriti");
		set.add("Ravi");
		set.add(null);
		System.out.println(set);
		
	}

}
//How set achieve uniquness?
