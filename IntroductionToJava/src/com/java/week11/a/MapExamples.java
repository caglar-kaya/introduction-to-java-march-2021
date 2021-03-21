package com.java.week11.a;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExamples {

	public static void main(String[] args) {

		// Collection classes only stores values
		// Map classes stores key-value pairs
		// Map doesn't allow duplicate key, but it can have duplicate value
		
		// TreeMap is sorting keys in alphabetic order
		Map<String, String> map = new TreeMap<>();
		
		map.put("robert@siliconelabs.com", "12345");
		map.put("ahmet@siliconelabs.com", "12345");
		map.put("ahmet@siliconelabs.com", "123456789");
		
		System.out.println(map);

		// LinkedHashMap is sorting the keys in insertion order
		Map<Double, Integer> map2 = new LinkedHashMap<>();
		
		map2.put(1.7, 1);
		map2.put(9.8, 7);
		map2.put(4.8, 3);

		System.out.println(map2);
		
		// HashMap doesn't maintain insertion order
		Map<String, String> map3 = new TreeMap<>();
		
		map3.put("robert@siliconelabs.com", "12345");
		map3.put("ahmet@siliconelabs.com", "12345");
		map3.put("ahmet@siliconelabs.com", "123456789");
		
		System.out.println(map3);
		
		map3.remove("ahmet@siliconelabs.com");
		System.out.println(map3);
		
		Map<String, String> map4 = new LinkedHashMap<>();
		map4.putAll(map);
		System.out.println(map4);
		
		boolean check = map3.containsKey("ahmet@siliconelabs.com");
		System.out.println(check);
		
		boolean check2 = map3.containsValue("12345");
		System.out.println(check2);
		
		map.replace("robert@siliconelabs.com", "12345", "54321");
		System.out.println(map);
		
	}

}
