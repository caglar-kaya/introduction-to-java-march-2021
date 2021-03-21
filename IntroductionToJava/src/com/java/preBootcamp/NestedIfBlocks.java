package com.java.preBootcamp;

public class NestedIfBlocks {

	public static void main(String[] args) {
		
		boolean myBoolean = true;
		
		if (myBoolean) {
			System.out.println("1");
			if (!myBoolean) {
				System.out.println("2");
			}
		}
		
		boolean voteAge = true;
		boolean felony = false;
		boolean citizenShip = true;
		
		if (!felony && citizenShip) {
			if (voteAge) {
				System.out.println("This person can vote.");
			}
		}
		
	}

}
