package com.java.week08.b;

public class Question3 {
	
	static void average(double...element) {
		if (element.length > 0) {
			double sum = 0, average;
			for (int i = 0; i < element.length; i++) {
				sum += element[i];
			}
			average = sum / element.length;
			System.out.println("\nAverage of your numbers : " + average);
		} else {
			System.out.println("\nThere is no number.");
		}
		
	}

	public static void main(String[] args) {
		
		average(3.7, 5.3);
		average(5, 8, 2);
		average();
	}

}
