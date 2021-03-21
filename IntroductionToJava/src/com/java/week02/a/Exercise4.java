package com.java.week02.a;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String myString = scanner.nextLine();
		
		System.out.println("The first 3 letters of " + myString +
				" is " + myString.substring(0, 3));
		
	}

}
