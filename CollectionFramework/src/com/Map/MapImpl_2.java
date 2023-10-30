package com.Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapImpl_2 {

	public static void main(String[] args) {
		
		Map<Character,Integer> map = new LinkedHashMap<>();
		map.put('B', 10);
		map.put('C', 20);
		map.put('A', 30);
		map.put('E', 40);
		map.put('D', 50);
		map.put(null, 60);
		
		System.out.println(map);
		
		Map<String,Integer> map2 = new TreeMap<>();
		map2.put("Bindra", 10);
		map2.put("Ajit", 20);
		map2.put("Abhisekh", 30);
		map2.put("John", 40);
		map2.put("Chaplin", 50);
		//map2.put(null, 60);
		
		System.out.println(map2);

	}

}
