package com.java.week10.b;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	static LinkedHashSet<Integer> iLinkedHashSet;
	
	public static void main(String[] args) {
		
		iLinkedHashSet = new LinkedHashSet<>(Arrays.asList(3,5,7,3,2,1));
		
		System.out.println(iLinkedHashSet); // [3, 5, 7, 2, 1]
		
		
	}

}
