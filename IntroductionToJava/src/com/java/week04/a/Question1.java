package com.java.week04.a;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("\nEnter first number: ");
		double number1 = scanner.nextDouble();
		
		System.out.print("\nEnter second number: ");
		double number2 = scanner.nextDouble();
		
		System.out.print("\nEnter third number: ");
		double number3 = scanner.nextDouble();
		
		System.out.println("\nAverage of your numbers : " 
				+ average(number1, number2, number3));
	}
	
	public static double average(double a, double b, double c) {
		return (a + b + c) / 3;
	}

}
