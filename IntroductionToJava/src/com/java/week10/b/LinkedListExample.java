package com.java.week10.b;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {

		// ArrayList : Dynamic Array Algorithm
		// LinkedList : Doubly LinkedList Algorithm
		// Manipulation is faster than ArrayList
		
		LinkedList<String> linkedList = new LinkedList<>();
		
		linkedList.add("Ahmet");
		linkedList.add("Labs");
		linkedList.add("School");
		
		System.out.println(linkedList); // [Ahmet, Labs, School]
		
		linkedList.set(2, "Company");
		
		System.out.println(linkedList); // [Ahmet, Labs, Company]
		
		System.out.println(linkedList.get(1)); // Labs
	}

}
