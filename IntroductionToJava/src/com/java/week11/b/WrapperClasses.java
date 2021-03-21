package com.java.week11.b;

public class WrapperClasses {

	public static void main(String[] args) {

		// Wrapper Classes are non-primitive version of primitive data types
		
		// Primitive data types :

		// Number -> Integer, Double, Float, Byte
		
		Integer integer = 9;
		
		System.out.println(integer + 10); // 19
		
		Double double1 = 90.8;
		
		Float float1 = 88.7f;
		
		Number number = new Integer(5);
		
		show(double1, float1);
		
	}
	
	static void show(Number n1, Number n2) {
		System.out.println(n1);
		System.out.println(n2);
	}

}
