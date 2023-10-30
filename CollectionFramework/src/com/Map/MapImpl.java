package com.Map;

import java.util.HashMap;
import java.util.Map;

public class MapImpl {

	public static void main(String[] args) {
		Map<Character,Integer> map = new HashMap<>();
		map.put('B', 10);
		map.put('C', 20);
		map.put('A', 30);
		map.put('E', 40);
		map.put('D', 50);
		map.put(null, 60);
		
		System.out.println(map);
		
		System.out.println(map.get('B'));
		
		//Iterate over map
		
		for(Map.Entry<Character, Integer> entry:map.entrySet()){
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		System.out.println(map.containsKey('D'));
		System.out.println(map.containsKey('X'));
		
		Character key = 'C';
		if(map.containsKey(key)){
			System.out.println(map.get(key));
		}

	}

}
