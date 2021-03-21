package com.java.week03.a;

import java.util.Arrays;

public class SplitMethod {

	public static void main(String[] args) {

		// Split method is a method inside of String class
		
		String arr [] = "Ahmet Can Turk".split(" ");
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("****************************");
		
		String string = "Ahmet Can is the Java teacher in Quality Assurance Engineering School";
		
		String [] arrString = string.split(" ");
		
		for (String string2 : arrString) {
			if (string2.startsWith("A")) {
				System.out.println(string2);
			}
		}
		
		System.out.println("****************************");

		
		
	}

}
