package com.java.week10.b;

import java.util.Arrays;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// Vector is synchronized class, and it has legacy methods in it.
		
		Vector<Integer> vector = new Vector<>(Arrays.asList(1,2,3,4,5));
		
		System.out.println(vector); // [1, 2, 3, 4, 5]
		
		vector.add(99);
		
		System.out.println(vector); // [1, 2, 3, 4, 5, 99]
		
	}

}
