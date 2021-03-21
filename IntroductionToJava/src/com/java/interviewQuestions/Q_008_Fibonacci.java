package com.java.interviewQuestions;

import java.util.ArrayList;

public class Q_008_Fibonacci {

	public static void main(String[] args) {

		// Fibonacci : 0, 1, 1, 2, 3, 5, 8, 13, 21,34,...
		
		int number1 = 0;
		int number2 = 1;
		
		System.out.println(number1 + "\n" + number2);
		
		for (int i = 0; i < 8; i++) {
			int next = number1 + number2;
			System.out.println(next);
			number1 = number2;
			number2 = next;
		}
	}

}
