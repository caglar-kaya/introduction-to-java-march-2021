package com.java.week06.a;

public class LameCalculator {

	public static void main(String[] args) {

		LameCalculator2 lc = new LameCalculator2();
		System.out.println(lc.plus(1,1));
		System.out.println(lc.minus(1, 1));
		System.out.println(lc.multiply(2, 1));
		System.out.println(lc.divide(10, 2));
	}
}
class LameCalculator2 {
	
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
