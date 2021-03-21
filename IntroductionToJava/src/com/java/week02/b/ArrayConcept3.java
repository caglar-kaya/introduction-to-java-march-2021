package com.java.week02.b;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayConcept3 {

	public static void main(String[] args) {
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter a number: ");
//		//int number = scanner.nextInt();
//		
//		int [] numbers = {scanner.nextInt(), scanner.nextInt()};
//		System.out.println(Arrays.toString(numbers));
		
		int [] numbers = {1,2,3,4,5,6,7,8,9};
		
		int count = 0;
		
		for (int item : numbers) {
			count++;
			System.out.println(item*2);
		}
		
		System.out.println("count: " + count);
		
		
	}

}
