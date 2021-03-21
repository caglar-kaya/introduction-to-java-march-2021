package com.java.week02.b;

public class Exercise1 {

	public static void main(String[] args) {
		
		int [] numbers = {1,2,3,4,5,6,7,8,9};
		
		for (int item : numbers) {
			if (item % 3 == 0) {
				System.out.println(item);
			}
		}
	}

}
 