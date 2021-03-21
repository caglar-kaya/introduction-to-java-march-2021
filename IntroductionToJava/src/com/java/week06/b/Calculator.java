package com.java.week06.b;

public class Calculator {
	
	static int plus(int a, int b) {
		return a + b;
	}
	
	static int minus(int a, int b) {
		return a - b;
	}
	
	static int multiply(int a, int b) {
		return a * b;
	}
	
	static int divide(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {

		System.out.println(Calculator.plus(1,1));
		System.out.println(Calculator.minus(1, 1));
		System.out.println(Calculator.multiply(2, 1));
		System.out.println(Calculator.divide(10, 2));
	}

}
