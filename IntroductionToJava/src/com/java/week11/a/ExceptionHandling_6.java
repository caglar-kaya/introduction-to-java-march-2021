package com.java.week11.a;

public class ExceptionHandling_6 {

	public static void main(String[] args) {

		method(9, 0);
	}
	
	// Runtime vs. Compiletime Exceptions
	/*
	 *  Runtime Exceptions :
	 *  IndexOutOfBound, ArrayIndexOutOfBoundsException, Aritmetic, NullPointer, ..
	 *  
	 *  Compiletime Exceptions :
	 *  Exception, IOException, ..
	 */
	static void method(int a, int b) throws ArithmeticException {
		System.out.println(a / b);
	}
	
	// Errors are physical boundries that cannot be handled by developer
	// Exceptions are developer mistakes that can be handled in two ways

}
