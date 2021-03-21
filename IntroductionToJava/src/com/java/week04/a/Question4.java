package com.java.week04.a;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("\nEnter a sentence : ");
		String sentence = scanner.nextLine();
		
		System.out.println("\nNumber of words in your sentence : " 
							+ countWords(sentence));
		
		System.out.println("\nNumber of vowels in your string : " 
				+ Question3.countVowels(sentence));
	}
	
	public static int countWords(String string) {
		
		String[] wordsOfString = string.split(" ");
		
		return wordsOfString.length;
	}
	
}


