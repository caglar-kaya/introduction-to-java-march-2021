package com.java.interviewQuestions;

public class Q_001_FindingAsciiValues {

	public static void main(String[] args) {

		char character = '0';
		System.out.println((int) character); // 48
		
		int ascii = character;
		System.out.println(ascii); // 48
		
		int number = 90;
		
		char asciiNumber = (char) number;
		System.out.println(asciiNumber); // Z
		
	}

}
