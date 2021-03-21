package com.java.week11.a;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapEntryInterface {

	public static void main(String[] args) {

		Map<Integer, String> names = new LinkedHashMap<Integer, String>();
		
		names.put(4298, "Ahmet");
		names.put(4299, "Furkan");
		names.put(4200, "Oktay");
		names.put(4305, "Fatih");
		
		System.out.println(names);
		
		// Iterator
		Set set = names.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		// For Each Loop
		for (Map.Entry map : names.entrySet()) {
			System.out.println(map.getKey() + " " + map.getValue());

		}
		
	}

}
