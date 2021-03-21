package com.java.week04.a;

import java.util.Arrays;

public class MethodConcept1 {
	
	static int method1(int x) {
		return x + 10;
	}
	
	static double method2(int a, int b) {
		return a + b;
	}
	
	static int findAge(int birthYear) {
		int age = 2020-birthYear;
		return age;
	}

	public static void main(String[] args) {

		/* Methods are collection of statements which returns values
		 * depending on the algorithm inside.
		 */
		
		System.out.println(method1(20));
		
		System.out.println(method2(3, 5));
		
		System.out.println("My age is " + findAge(1988));
		
		int[] ages = {findAge(1990), findAge(1999), findAge(2002)};
		
		System.out.println(Arrays.toString(ages));
	}

}
