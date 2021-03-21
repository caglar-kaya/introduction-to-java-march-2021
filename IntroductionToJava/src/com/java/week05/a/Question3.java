package com.java.week05.a;

public class Question3 {

	public static void main(String[] args) {
		
		 System.out.println("1+1 = " + calc.plus(1,1) );
		 
		 System.out.println("1-1 = " + calc.minus(1,1) );
	}

}

class calc {
	
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
}