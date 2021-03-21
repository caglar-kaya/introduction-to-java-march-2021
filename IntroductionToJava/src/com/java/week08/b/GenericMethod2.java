package com.java.week08.b;

import java.util.Arrays;

public class GenericMethod2 {

	static <E> String[] converter(E ... element) {
		String[] newArray = new String[element.length];
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = element[i].toString();
		}
		return newArray;
	}

	public static void main(String[] args) {

		Integer [] integer = {1, 2, 3};
		System.out.println(Arrays.toString(converter(integer)));
		
		System.out.println(Arrays.toString(converter(42.98, 4299, 42.77)));
		
	}

}
