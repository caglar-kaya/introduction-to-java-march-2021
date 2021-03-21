package com.java.interviewQuestions;

import java.util.Random;

public class Q_004_GenerateRandomNumbers {

	public static void main(String[] args) {
		// 1.
		Random random = new Random();
		System.out.println(random.nextInt());
		
		// 2.
		System.out.println(random.nextInt(3));

		
		// 3. Math.random() : [0,1)
		System.out.println((int) (Math.random() * 10));
	}

}
