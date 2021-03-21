package com.java.week11.b;

import java.time.LocalDate;

public class DateConcept_1 {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();
		
		// Print today's date
		System.out.println("Today's Date: " + today);
		
		// Print tomorrow's date
		System.out.println("Tomorrow's Date: " + today.plusDays(1));
		
		// Print yesterday's date
		System.out.println("Yesterday's Date: " + today.minusDays(1));
		
		// The length of the year
		System.out.println("The length of the year: " + today.minusYears(1).lengthOfYear());
		
		// Create Customize Date
		LocalDate date = LocalDate.of(1994, 9, 23);
		
		System.out.println(date);
		
	}

}
