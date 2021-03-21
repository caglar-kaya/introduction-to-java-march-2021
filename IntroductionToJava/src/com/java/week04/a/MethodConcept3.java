package com.java.week04.a;

public class MethodConcept3 {

	static void print(String message) {
		System.out.println(message);
	}
	
	static void addition(int a, int b) {
		System.out.println(a + b);
	}
	
	static void reverseString(String string) {
		for (int i = 0; i < string.length(); i++) {
			System.out.print(string.charAt(string.length()-1-i));
		}
		System.out.println();
	}
	
	public static void main(String[] args) {

		print("Hello World");
		
		addition(7, 9);
		
		reverseString("Caglar");
		reverseString("Kaya");
		
	}

}
