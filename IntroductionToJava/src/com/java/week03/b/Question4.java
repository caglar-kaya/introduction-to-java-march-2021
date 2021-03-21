package com.java.week03.b;

public class Question4 {

	public static void main(String[] args) {

		int [] nums = {100,234,311,5433,6454,1233,54523,45645,1234};
		int sum = 0;
		int sumOfEvens = 0;
		int sumOfOdds = 0;
				
		for (int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
			if (nums[i] % 2 == 0) {
				sumOfEvens += nums[i];
			} else {
				sumOfOdds += nums[i];
			}
		}
		
		System.out.println("\nThe sum of elements: " + sum);
		System.out.println("\nThe sum of even elements: " + sumOfEvens);
		System.out.println("\nThe sum of odd elements: " + sumOfOdds);
	}

}
