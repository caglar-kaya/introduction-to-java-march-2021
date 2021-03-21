package com.java.week02.a;

import java.util.Scanner;

public class SwitchCaseStatements2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your grade: ");
		String key = scanner.next();
		
		switch (key) {
		case "A":
			System.out.println("Excellent");
			break;
		case "B":
			System.out.println("Well Done");
			break;
		case "C":
			System.out.println("Good Job");
			break;
		case "D":
			System.out.println("You passed");
			break;
		case "F":
			System.out.println("You failed");
			break;
		default:
			System.out.println("Invalid Grade.");
			break;
		}
		
		
	}

}
