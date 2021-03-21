package com.java.week04.b;

public class Question5 {

	static int sumFivesRange(int a, int b) {
		int sum = 0;
		for (int i = a; i <= b; i++) {
			if (i % 5 == 0) {
				sum += i;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {

		System.out.println(sumFivesRange(5,15)); //30
		System.out.println(sumFivesRange(11,28)); //60
	}

}
