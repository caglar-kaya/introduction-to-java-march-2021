package com.java.week11.a;

public class ExceptionHandling_4 {

	public static void main(String[] args) throws Exception {

		// Two ways to handle exception : try-catch, throws keyword
		// throws keyword is to make code compilable, but 
		// if there is a problem, exception will be throwed 
		// throws keyword warns developers for that method can throw exception
		
		System.out.println("Hello World");
		Thread.sleep(5000); // Slows the program for 5 seconds
		method(9, 0);
		
	}
	
	static void method(int a, int b) throws Exception {
		System.out.println(a / b);
	}

}
