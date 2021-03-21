package com.java.week02.b;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int [] numbers = new int[10];
		
		int count = 0; 
		
		for (int item : numbers) {
			count++;
			System.out.print("Enter " + count + ". element: ");
			numbers[count-1] = scanner.nextInt();
		}
		
		System.out.println(Arrays.toString(numbers));
		
		for (int i : numbers) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

}
