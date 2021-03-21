package com.java.week10.b;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(42, 45, 98));
		
		System.out.println(list); // [42, 45, 98]
		
		list.add(333);
		System.out.println(list); // [42, 45, 98, 333]
		
		System.out.println(list.get(0)); // 42
		
		list.add(3, 222);
		System.out.println(list); // [42, 45, 98, 222, 333]
		
		System.out.println(list.size()); // 5
		
		list.set(2, 999);
		System.out.println(list); // [42, 45, 999, 222, 333]
		
		list.remove(1);
		System.out.println(list); // [42, 999, 222, 333]
		
		Collections.sort(list);
		System.out.println(list); // [42, 222, 333, 999]
		
		list.remove((Integer)999);
		System.out.println(list); // [42, 222, 333]
		
	}

}
