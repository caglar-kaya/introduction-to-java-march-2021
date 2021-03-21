package com.java.interviewQuestions;

import java.time.Year;

public class Q_007_LeapYear {

	public static void main(String[] args) {

		int year = 2000;
		
		if (year % 4 == 0 && year % 100 != 0) {
			System.out.println(year+ " is a leap year");
		}else if (year % 400 == 0) {
			System.out.println(year + " is a leap year");
		}else {
			System.out.println(year + " is not a leap year");
		}
		
		Year year2 = Year.of(year);
		System.out.println(year2.isLeap());
	}

}
