package com.java.week01.b;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {            

		Scanner muhammmed = new Scanner(System.in);
	
		System.out.print("Enter a character : ");
		char inputCharacter = muhammmed.next().charAt(0);
		
		System.out.print("Enter first number: ");
		int a = muhammmed.nextInt();
		
		System.out.print("Enter second number: ");
		int b = muhammmed.nextInt();
	
		// int a = 10, b = 90;
		
		if (inputCharacter == '+') {
			System.out.println("Your choice is addition.");
			System.out.println("a + b = " + (a + b));
		}
		else if (inputCharacter == '-') {
			System.out.println("Your choice is subtraction.");
			System.out.println("a - b = " + (a - b));
		}
		else if (inputCharacter == '*') {
			System.out.println("Your choice is multiplication.");
			System.out.println("a * b = " + (a * b));
		}
		else if (inputCharacter == '/') {
			System.out.println("Your choice is division.");
			System.out.println("a / b = " + ((float)a / b));
		}
		else if (inputCharacter == '%') {
			System.out.println("Your choice is modulus.");
			System.out.println("a % b = " + (a % b));
		}
		else {
			System.out.println("Invalid Character");
		}
	}

}
