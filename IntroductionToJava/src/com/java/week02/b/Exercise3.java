package com.java.week02.b;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String [] strings = new String[5];
				
		int count = 0;
		
		for (String item : strings) {
			count++;
			System.out.print("Enter " + count + ". element: ");
			strings[count-1] = scanner.nextLine();
		}
		
		System.out.println(Arrays.toString(strings));
		
		for (String string : strings) {
			if (string.endsWith("a")) {
				System.out.println(string);
			}
		}
	}

}
