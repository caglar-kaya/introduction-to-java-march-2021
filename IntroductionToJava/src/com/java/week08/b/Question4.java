package com.java.week08.b;

import java.util.Arrays;

public class Question4 {
	
	static int getMaximum(int...numbers) {
		if (numbers.length > 0) {
			Arrays.sort(numbers);
			return numbers[numbers.length-1];
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {

		System.out.println("\nMaximum of your numbers : " + getMaximum(85,5,2,100,9));
		
		System.out.println("\nMaximum of your numbers : " + getMaximum());
	}

}
