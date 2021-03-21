package com.java.week01.a;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		
		System.out.println("Let's check an integer is even or odd..");
		System.out.print("So please enter your integer number: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if (number % 2 == 0) System.out.println(number + " is even integer number.");
		if (number % 2 == 1) System.out.println(number + " is odd integer number.");
	}

}
