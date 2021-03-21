package com.java.week02.a;

import java.util.Scanner;

public class WarmUp {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number: ");
		int a = scanner.nextInt();
		
		if (a > 0) {
			System.out.println("Positive");
		} else if (a == 0) {
			System.out.println("Zero");
		} else {
			System.out.println("Negative");
		}
		
		
		
		
	}

}
