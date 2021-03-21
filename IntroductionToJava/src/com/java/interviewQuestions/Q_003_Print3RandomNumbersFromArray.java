package com.java.interviewQuestions;

import java.util.Random;

public class Q_003_Print3RandomNumbersFromArray {

	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5,6,7,8,9,0};
		
		for (int i = 0; i < 3; i++) {
			System.out.println(arr[(int) (Math.random() * 10)]);
		}
		
		for (int i = 0; i < 3; i++) {
			System.out.println(arr[new Random().nextInt(10)]);
		}
		
	}

}
