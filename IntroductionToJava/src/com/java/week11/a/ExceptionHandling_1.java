package com.java.week11.a;

public class ExceptionHandling_1 {

	public static void main(String[] args) {

		// Exceptions are error events that terminates the natural flow of the program
		
		System.out.println("Hello World");
		
		try {
			System.out.println(9/0); // java.lang.ArithmeticException: / by zero
		} catch (ArithmeticException e) {
			// e.printStackTrace();
			System.out.println("A number can not be divided by zero!");
		} catch (StringIndexOutOfBoundsException e) {
			// e.printStackTrace();
			System.out.println("A number can not be divided by zero!");
		}
		
		System.out.println("Hello World Again");

		
	}

}
