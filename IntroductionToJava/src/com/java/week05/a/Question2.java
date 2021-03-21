package com.java.week05.a;
public class Question2 {
	public static void main(String[] args) {

		LameCalculator lc = new LameCalculator();
		
		System.out.println(lc.plus(1,1));
		System.out.println(lc.minus(1, 1));
		System.out.println(lc.multiply(2, 1));
		System.out.println(lc.divide(10, 2));
		
	}
}

class LameCalculator {
	
	int plus(int a, int b) {
		return a + b;
	}
	
	int minus(int a, int b) {
		return a - b;
	}
	
	int multiply(int a, int b) {
		return a * b;
	}
	
	int divide(int a, int b) {
		return a / b;
	}
}