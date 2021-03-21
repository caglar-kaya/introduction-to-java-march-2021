package com.java.week11.b;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneIdConcept {

	public static void main(String[] args) {

		Instant timeStamp = Instant.now();
		System.out.println(timeStamp);
		
		// Timestamp in Zone : America/Los_Angeles
		ZonedDateTime lAZonedDateTime = timeStamp.atZone(ZoneId.of("America/Los_Angeles"));
		
		System.out.println("Los Angeles Time : " + lAZonedDateTime);
		
		// "GMT+01:00"
		ZonedDateTime zonedDateTime3 = timeStamp.atZone(ZoneId.of("GMT+01:00"));
		
		System.out.println("GMT+01:00" + zonedDateTime3);
		
		// "GMT+02:00"
		ZonedDateTime zonedDateTime4 = timeStamp.atZone(ZoneId.of("GMT+02:00"));
		
		System.out.println("GMT+02:00" + zonedDateTime4);
	}

}
