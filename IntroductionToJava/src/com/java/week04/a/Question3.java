package com.java.week04.a;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("\nEnter a string : ");
		String string = scanner.nextLine();
		
		System.out.println("\nNumber of vowels in your string : " 
							+ countVowels(string));
	}
	
	public static int countVowels(String string) {
		
		int count = 0;
		
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == 'a' || string.charAt(i) == 'A' ||
				string.charAt(i) == 'e' || string.charAt(i) == 'E' ||
				string.charAt(i) == 'i' || string.charAt(i) == 'I' ||
				string.charAt(i) == 'o' || string.charAt(i) == 'O' ||
				string.charAt(i) == 'u' || string.charAt(i) == 'U') 
			{
				count++;
			}
		}
		return count;
	}

}
