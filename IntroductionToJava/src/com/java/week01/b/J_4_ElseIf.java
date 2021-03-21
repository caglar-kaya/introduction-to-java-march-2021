package com.java.week01.b;

public class J_4_ElseIf {

	public static void main(String[] args) {
		
		boolean myBoolean = true;
		
		if (!myBoolean) {
			System.out.println("If Block");
		} else if (myBoolean) {
			System.out.println("Else If block");
		} else {
			System.out.println("Else Block");
		}
		
		int a = 0;
		
		if (a > 0) {
			System.out.println("positive");
		} else if (a < 0) {
			System.out.println("negative");
		}
		else {
			System.out.println("zero");
		}
		
		int x = 6;
		
		if (x%2==0 && x%3==0) {
			System.out.println("FizzBuzz");
		} else if (x%3==0) {
			System.out.println("Buzz");
		} else if (x%2==0) {
			System.out.println("Fizz");
		} else {
			System.out.println("Neither Fizz nor Buzz");
		}
		
		
		int NumericGrade = 100;
		String LetterGrade = "";
		
		if (NumericGrade >= 90 && NumericGrade <= 100) {
			LetterGrade = "A";
		} else if (NumericGrade >= 75 && NumericGrade <= 100) {
			LetterGrade = "B";
		} else if (NumericGrade >= 70 && NumericGrade <= 100) {
			LetterGrade = "C";
		} else if (NumericGrade >= 60 && NumericGrade <= 100) {
			LetterGrade = "D";
		}else if (NumericGrade >= 0 && NumericGrade <= 100) {
			LetterGrade = "F";
		} else {
			System.out.println("Invalid Input");
		}
		
		System.out.println(LetterGrade);
		
		
		
		
		
		
		
		
	}

}
















