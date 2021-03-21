package com.java.week03.a;

public class ContinueStatement {

	public static void main(String[] args) {
		
		// continue means skip the statement
		
		int [] numbers = {5,5,5,5,1,2,3,45,5,6,7,8,98};
		
//		for (int i = 0; i < numbers.length; i++) {
//			if (numbers[i] != 5)  {
//				System.out.println(numbers[i]);
//			}
//		}
		
//		for (int i = 0; i < numbers.length; i++) {
//			if (numbers[i] == 5)  {
//				continue;
//			}
//			System.out.println(numbers[i]);
//		}
		
//		for (int i = 0; i < numbers.length; i++) {
//			if (numbers[i] == 5)  {
//				continue;
//			}
//			System.out.println(numbers[i]);
//		}
		
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}

}















