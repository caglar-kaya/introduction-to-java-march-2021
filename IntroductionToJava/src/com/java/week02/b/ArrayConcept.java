package com.java.week02.b;

import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {

		// array is non-primitive and stay in Heap Memory
		// array is a variable that can store more than one value
		
		int [] numbers = {9,4,5,6};
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println("********************");
		
		System.out.println(Arrays.toString(numbers));
		System.out.println("********************");
		
		System.out.println(numbers.length);
		System.out.println("********************");
		
		for (int item : numbers) {
			System.out.println(item);
		}
		
		System.out.println("********************");

		String [] name = {"John", "Wayne", "Mel", "Gibson"};
		
		System.out.println(Arrays.toString(name));
		
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		System.out.println(name[3]);
		
		System.out.println("********************");
		
		int [] numbers2 = new int[5];
		
		numbers2[0] = 90;
		numbers2[1] = 50;
		numbers2[2] = 70;
		numbers2[3] = 20;
		numbers2[4] = 60;
		
		System.out.println(Arrays.toString(numbers2));

		System.out.println("********************");

		int [] nums = new int[]{1,2,3,4,5};
		
		Object [] objects = {"String", 3, 4.7, true, 9==8, 'A'};
		
		System.out.println(Arrays.toString(objects));
		
		System.out.println("********************");
		
		boolean [] booleans = {"Ahmet".equals("Ahmed"), true, 9<0};
		
		System.out.println(Arrays.toString(booleans));

		System.out.println("********************");

	}

}






















































