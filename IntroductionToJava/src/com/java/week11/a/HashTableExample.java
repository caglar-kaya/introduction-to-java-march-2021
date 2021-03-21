package com.java.week11.a;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {

	public static void main(String[] args) {

		// HashTable class extend to dictionary class
		// HashTable is an array of a list. Each list is known bucket, and 
		// their positions are identified by hashcode() method
		// Hash Table also contains key and values
		
		Hashtable<Integer, String> hm = new Hashtable<>();
		
		hm.put(4290, "Ilhan");
		hm.put(4299, "Micheal");
		hm.put(4301, "Fatih");

		for (Map.Entry mEntry : hm.entrySet()) {
			System.out.println(mEntry.getKey() + " " + mEntry.getValue());
		}
		
		// What is the difference between HashTable and HashMap
		// HashTable is synchronised, HashMap is not synchronised
		// HashTable is slower, HashMap is faster
		
	}

}
