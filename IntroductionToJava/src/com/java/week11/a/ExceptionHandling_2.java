package com.java.week11.a;

public class ExceptionHandling_2 {

	public static void main(String[] args) {

		try {
			String string = "Java";
			System.out.println(string.charAt(4));
		} catch (StringIndexOutOfBoundsException e) {
			//e.printStackTrace();
			System.err.println("You are out of the range.");
		}
		
		System.out.println("\nThis is the rest of code.");
	}

}
