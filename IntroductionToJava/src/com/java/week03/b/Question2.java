package com.java.week03.b;

public class Question2 {

	public static void main(String[] args) {

		double [] prices = {15,30,88,7,90,25,1,9,19,21};
		
		int count = 0;
		
		for (int i = 0; i < prices.length; i++) {
			if (prices[i] > 20) {
				count++;
			}
		}
		
		if (count == 0) {
			System.out.println("\nNo items that costs more than $20");
		} else if (count == 1) {
			System.out.println("\nThere is " + count + " item that costs more than $20.");
		} else {
			System.out.println("\nThere are " + count + " items that cost more than $20.");
		}
		
	}

}
