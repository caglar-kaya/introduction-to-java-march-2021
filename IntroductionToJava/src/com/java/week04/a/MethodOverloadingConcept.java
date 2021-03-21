package com.java.week04.a;

public class MethodOverloadingConcept {
	
	// Method Overloading : creating methods with same name but
	// different parameters
	
	static int addition(int a, int b) {
		return a + b;
	}
	
	static double addition(double a, double b) {
		return a + b;
	}
	
	public static void main(String[] args) {

		System.out.println(addition(3, 5));
		
		System.out.println(addition(3.3, 5.5));
		

	}

}
