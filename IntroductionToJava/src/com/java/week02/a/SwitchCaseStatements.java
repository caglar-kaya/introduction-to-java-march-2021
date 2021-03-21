package com.java.week02.a;

public class SwitchCaseStatements {

	public static void main(String[] args) {
		/*
		 *  Switch case vs if else:
		 *  1. in switch case, multiple cases can be executed at the 
		 *  same time
		 *  2. in switch case program only checks equality of the key and
		 *  value
		 *  3.
		 *  
		 */
		// key, value
		// switch case statements are special blocks
		// which runs only if key and value would be equal
		
		int key = 8;
		
		switch (key) {
		case 90:
			System.out.println("This is case");
			break;
		case 4:
			System.out.println("This is case 2");
			break;
		case 5:
			System.out.println("This is case 2");
			break;
		default:
			System.out.println("This is default.");
		}
	}

}
