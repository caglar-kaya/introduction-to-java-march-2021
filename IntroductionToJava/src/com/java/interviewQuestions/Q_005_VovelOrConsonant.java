package com.java.interviewQuestions;

public class Q_005_VovelOrConsonant {

	public static void main(String[] args) {

		//Question: Check whether an alphabet is Vowel or Consonant
				// a e i o u
		
		char character = 'b';
		
		if (character == 'a' || character == 'e' || character == 'i'
				|| character == 'o' || character == 'u') {
			System.out.println(character + " is vovel.");
		} else {
			System.out.println(character + " is consonant.");
		}
		
		switch (character) {
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			System.out.println(character + " is vovel.");
			break;
		default:
			System.out.println(character + " is consonant.");
			break;
		}
	}

}
