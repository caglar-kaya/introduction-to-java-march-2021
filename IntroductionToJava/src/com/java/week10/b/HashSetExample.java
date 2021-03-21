package com.java.week10.b;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {

		HashSet<String> hashSet = new HashSet<>();
		
		hashSet.add("Silicone");
		hashSet.add("Labs");
		hashSet.add("Silicone");
		hashSet.add("School");
		hashSet.add("Labs");
		
		for (String string : hashSet) {
			System.out.println(string);
		}
		
		System.out.println();
		
		System.out.println(hashSet); // [Labs, School, Silicone]
		
		hashSet.remove("School");
		
		System.out.println(hashSet); // [Labs, Silicone]
		
		System.out.println(hashSet.contains("Labs")); // true
		
		System.out.println(hashSet.size()); // 2
		
		Iterator<String> iterator = hashSet.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
