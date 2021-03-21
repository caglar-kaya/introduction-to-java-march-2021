package com.java.week04.b;

public class Question3 {
	
	int sumToX(int x) {
		int sum = 0;
		for (int i = 1; i <= x; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {

		Question3 ref = new Question3();
		
		System.out.println(ref.sumToX(5)); // 15
		
		System.out.println(ref.sumToX(7)); // 28
	}

}
