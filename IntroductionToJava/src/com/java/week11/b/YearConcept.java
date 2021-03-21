package com.java.week11.b;

import java.time.Month;
import java.time.Year;
import java.time.YearMonth;

public class YearConcept {

	public static void main(String[] args) {

		Year year = Year.of(1992);
		Year year2 = Year.of(1993);
		
		// Default Year
		System.out.println(year);
		
		// Check if year is leap year
		System.out.println(year.isLeap());
		
		// Check before after
		System.out.println(year.isAfter(year2)); // false
		System.out.println(year.isBefore(year2)); // true
		
		System.out.printf("%s : %td%n", year, year.atDay(4));
		
		YearMonth date = YearMonth.now();
		
		System.out.println(date.getMonthValue());
		
		System.out.printf("%s : %d%n", date, date.lengthOfMonth());
		
		YearMonth date2 = YearMonth.of(1990, Month.FEBRUARY);
		
		System.out.printf("%s : %d%n", date2, date2.lengthOfMonth());

	}

}
