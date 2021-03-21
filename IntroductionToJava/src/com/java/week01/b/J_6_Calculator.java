package com.java.week01.b;

import java.util.Scanner;

public class J_6_Calculator {

	public static void main(String[] args) {
		/*
		 * nextInt() : Get integer
		 * nextDouble() : Get Double
		 * nextFloat() : Get Float
		 * nextByte() : Get Byte
		 * nextShort() : Get short
		 * nextLong() : Get Long
		 * nextBoolean() : Get Boolean
		 * next() : Get a word
		 * nextLine() : Get a line of string
		 * next().charAt(0) : Get a character
		 */
		
		// to get character : next().charAt(0)
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a character: ");
		char inputCharacter = input.next().charAt(0);
		System.out.println(inputCharacter);
		
		int a = 10, b = 90;
		
		if (inputCharacter == '+') {
			System.out.println(a+b);
		} else if (inputCharacter == '-') {
			System.out.println(a-b);
		} else {
			System.out.println("Invalid Character");
		}
		
		
		
	}

}
