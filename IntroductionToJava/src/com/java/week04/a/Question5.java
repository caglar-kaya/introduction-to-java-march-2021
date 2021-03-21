package com.java.week04.a;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("\nEnter an integer : ");
		int number = scanner.nextInt();
		
		System.out.println("\nThe sum of the digits of your number : " 
							+ sumOfDigits(number));
	}
	
	public static int sumOfDigits(int a) {
		
		int sum = 0;
		
		while (a > 0) {
			sum += a % 10;
			a /= 10;
		}
		
		return sum;
	}

}
