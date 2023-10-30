package com.Set;

import java.util.LinkedHashSet;
import java.util.Set;
//LinkedHashSet: Insertion is maintained
//null is allowed
public class SetImpl_2 {

	public static void main(String[] args) {
		// LinkedList + HashSet(hashing)
		Set<String> set = new LinkedHashSet<>();
		set.add("Ravi");
		set.add("Amit");
		set.add("Rohan");
		set.add("Kriti");
		set.add("Ravi");
		set.add(null);
		System.out.println(set);
	}

}
