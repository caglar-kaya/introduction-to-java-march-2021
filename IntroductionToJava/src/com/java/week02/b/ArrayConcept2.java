package com.java.week02.b;

public class ArrayConcept2 {

	public static void main(String[] args) {

		int [] birthYears = {1990, 1988, 2000, 2007, 1964};
		// Age = Current year - birth year
		System.out.println(2020-birthYears[0]);
		System.out.println("*************************");
		
		// For each loop :
		int count = 0;
		
		for (int i : birthYears) {
			System.out.println("Your age is : " + (2020 - i));
			count++;
		}
		
		System.out.println("Count: " + count);
		
		System.out.println("*************************");

		String [] names = {"John", "Emily", "Grace", "Abigale"};
		
		for (String string : names) {
			System.out.println(string + " Kondilas");
		}
		
		System.out.println("*************************");

		int [] salaries = {3000, 4000, 5000, 9000, 10000};
		
		for (int item : salaries) {
			System.out.println("Net salary = " + (item*0.7));
		}
		
		
	}

}



















