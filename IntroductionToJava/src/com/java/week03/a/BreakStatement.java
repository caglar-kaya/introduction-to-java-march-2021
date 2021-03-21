package com.java.week03.a;

public class BreakStatement {

	public static void main(String[] args) {

//		for (int i = 0; i < 10; i++) {
//			System.out.println(i);
//			if (i == 8) {
//				break;
//			}
//		}
		
		int [] array = {1,2,3,4,100,99,88};
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 100) {
				System.out.println("I found 100 at " + i + ". index number.");
				break;
			}
		}
		
		
	}

}
