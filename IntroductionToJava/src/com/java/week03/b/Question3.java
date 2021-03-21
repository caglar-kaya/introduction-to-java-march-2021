package com.java.week03.b;

public class Question3 {

	public static void main(String[] args) {

		int [] array = {3,5,7,8,100,20,35,100,90,100};
		
		int count = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 100) {
				System.out.println("\nValue found at index " + i);
				count++;
				break;
			}
		}
		
		if (count == 0) {
			System.out.println("\n100 not found in the array");
		}
	}

}
