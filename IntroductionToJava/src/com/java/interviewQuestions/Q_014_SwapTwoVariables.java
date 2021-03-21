package com.java.interviewQuestions;

public class Q_014_SwapTwoVariables {

	public static void main(String[] args) {

		boolean value1 = true;
		boolean value2 = false;
		
		boolean temp;
		
		System.out.println("Before:");
		System.out.println("Value 1 : " + value1 );
		System.out.println("Value 2 : " + value2 );
		
		temp = value1;
		value1 = value2;
		value2 = temp;
		
		System.out.println("\nAfter:");
		System.out.println("Value 1 : " + value1 );
		System.out.println("Value 2 : " + value2 );
		
	}

}
