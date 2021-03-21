package com.java.week04.a;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("\nEnter a string : ");
		String string = scanner.next();
		
		System.out.println("\nMiddle character of your string: " 
							+ middleChar(string));
	}
	
	public static char middleChar(String string) {
		if (string.length() % 2 == 1) {
			return string.charAt(string.length()/2);
		} else {
			System.out.println("\nYour string doesn't have middle character.");
			return ' ';
		}
	}

}
