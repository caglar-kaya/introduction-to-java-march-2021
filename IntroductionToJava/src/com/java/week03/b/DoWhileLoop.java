package com.java.week03.b;

public class DoWhileLoop {

	public static void main(String[] args) {

		// DoWhile loop executes at least one time even if condition is false.
		
		int i = 1;
		
		do {
			//System.out.println(i);
			i--;
		} while (i > -5);
		
		int[] arr = {1,2,3,4,5,6,7};
		
		int j = 0;
		
		do {
			System.out.println(arr[j]);
			j++;
		} while (j < arr.length);
		
		
	}

}
