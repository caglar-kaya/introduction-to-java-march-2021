package com.java.preBootcamp;

public class LogicalOperators {

	public static void main(String[] args) {
		
		System.out.println(true && true); // true 
		System.out.println(true && true && true && false); // false
		System.out.println((9 > 8) && (9 < 7)); // false
		
		System.out.println(true || false && false ); // true 
		System.out.println(true || true || true || false); // true
		System.out.println((9 > 8) || (9 < 7)); // true
		
		
		
	}

}
