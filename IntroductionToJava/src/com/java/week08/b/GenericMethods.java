package com.java.week08.b;

import java.util.Arrays;

public class GenericMethods {
	
	// Generic methods can be used to have different data types in the parameter
	// E can be all kinds of data type
	
	static <E> void print(E ... element) {
		System.out.println(Arrays.toString(element));
	}
	
	public static void main(String[] args) {

		print("string");
		print(44);
		print(true);
		print("Caglar", 12345);
		
	}

}
