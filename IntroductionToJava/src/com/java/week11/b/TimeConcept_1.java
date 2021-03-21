package com.java.week11.b;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeConcept_1 {

	public static void main(String[] args) {

		LocalDateTime now = LocalDateTime.now();
		
		// Default Data
		System.out.println(now);
		
		// Customized Local Date
		LocalDateTime time = LocalDateTime.of(1992, 9, 23, 10, 25); 
		System.out.println(time);
		
		DateTimeFormatter formatter = 
				DateTimeFormatter.ofPattern("MMM dd yyyy hh:mm:ss a E w k");
		
		String stringTime = time.format(formatter);
		
		System.out.println(stringTime);
	}

}
