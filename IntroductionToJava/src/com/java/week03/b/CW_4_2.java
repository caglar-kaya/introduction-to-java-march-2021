package com.java.week03.b;

public class CW_4_2 {

	public static void main(String[] args) {
		
		int i = 1, sumOfEvens = 0, sumOfOdds = 0;
		
		do {
			if (i % 2 == 0) {
				sumOfEvens += i;
			} else {
				sumOfOdds += i;
			}
			i++;
		} while (i <= 100);
		
		System.out.println("\nSum of Evens: " + sumOfEvens);
		
		System.out.println("\nSum of Odds: " + sumOfOdds);
	}

}
