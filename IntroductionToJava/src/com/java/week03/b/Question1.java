package com.java.week03.b;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter array capacity: ");
	int count = input.nextInt();
	
	  int[] nums = new int[count];
		
	  //using a loop enter values one by one
	  for(int i=0; i < nums.length; i++) {
	  System.out.print("Enter number " + (i+1) + ":");
	  nums[i] = input.nextInt();
	  }
	  
	for (int item : nums) {
		System.out.print(item + " ");
	}
	
	System.out.println();
	
	for (int i = 0; i < nums.length; i++) {
		System.out.print(nums[i] + " ");
	}
	
	}

}
