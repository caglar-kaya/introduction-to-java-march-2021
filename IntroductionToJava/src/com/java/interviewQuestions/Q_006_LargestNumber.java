package com.java.interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q_006_LargestNumber {

	public static void main(String[] args) {

		int a = 19, b = 99, c = 67; 
		
		int [] arr = {a, b, c};
		
		Arrays.sort(arr);
		
		System.out.println("Smallest:" + arr[0]);
		
		System.out.println("Largest: " + arr[arr.length-1]);
		
		if (a > b && a > c) {
			System.out.println(a + " is the greatest number.");
		} else if (b > c) {
			System.out.println(b + " is the greatest number.");
		} else {
			System.out.println(c + " is the greatest number.");
		}
		
		ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(a,b,c));
		System.out.println(Collections.max(arr2));
	}

}
