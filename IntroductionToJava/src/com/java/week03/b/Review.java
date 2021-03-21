package com.java.week03.b;

import java.util.Arrays;

public class Review {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 5; i+=2) {
			//System.out.println(i + " : Hello");
		}
		
		for (int i = 0; i >= -5; i--) {
			//System.out.println(i);
		}
		
		int[] arr = {55,66,44,33,22};
		
		for (int i = 0; i < arr.length; i++) {
			//System.out.println(arr[i]);
		}
		
		int[] arr2 = new int[arr.length];
		
		System.out.println(Arrays.toString(arr2));
				
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i];
		}
		
		System.out.println(Arrays.toString(arr2));
		
		
		
	}

}



















