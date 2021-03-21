package com.java.week03.a;

import java.util.Arrays;

public class ArraysMethods {

	public static void main(String[] args) {
		
		// Arrays is a class in util package.
		// sort, equals, binarySearch, fill methods in Arrays.
		
		// Sort: 
		int [] numbers = {3,5,7,6,4,2,1};
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		
		String [] names = {"Zeynep", "Ahmet", "Burak", "John", "Grace"};
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
		// BinarySearch: (first we need to sort the array)
		System.out.println(Arrays.binarySearch(names, "Zeynep"));
		
		int [] arr = {5,4,3,2,1};
		Arrays.sort(arr);
		System.out.println(Arrays.binarySearch(arr, 5));
		
		// Equals Method:
		System.out.println(Arrays.equals(arr, numbers));
		
		// fill method: 
		int [] fives = new int[5];
		Arrays.fill(fives, 5);
		System.out.println(Arrays.toString(fives));
		
		// Print max and min of an array:
		int [] numbers2 = {66,5,44,88,99,11,0,100,-9};
		Arrays.sort(numbers2);
		System.out.println(Arrays.toString(numbers2));
		System.out.println("Min: " + numbers2[0]);
		System.out.println("Max: " + numbers2[numbers2.length-1]);
		
		
	}

}
































