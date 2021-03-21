package com.java.week11.a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionMethods {

	public static void main(String[] args) {

		// addAll() : adds whole list to another list
		
		List<String> list = new ArrayList<String>(Arrays.asList("C", "C#", "Gherkin", "Python"));
		
		Collections.addAll(list, "Java", "JavaScript", "Z");
		
		System.out.println(list);
		
		
		// Collections.max()
		
		System.out.println(Collections.max(list)); // Z
		
		// Collections.min()
		
		System.out.println(Collections.min(list)); // C
		
		

	}

}
