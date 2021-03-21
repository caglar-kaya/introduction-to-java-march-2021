package com.java.week03.b;

import java.util.Arrays;
import java.util.Scanner;

public class CW_4_1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] nums = new int[5];
			
		//using a loop enter values one by one
		
		for(int i=0; i < nums.length; i++) {
			System.out.print("Enter number " + (i+1) + ": ");
			nums[i] = input.nextInt();
		}
		
		System.out.println();
		System.out.println(Arrays.toString(nums));
		System.out.println();
		
		int i = 0;
		
		while (i < nums.length) {
			System.out.print(nums[i] + " ");
			i++;
		}
		    
	}

}
