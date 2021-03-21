package com.java.week02.b;

public class WarmUp {

	public static void main(String[] args) {

		int key = 7;
		String name = "Silicone Labs";
		
		switch (key) {
		case 9:
			name = name.toUpperCase();
			break;
		case 4:
			name = name.toLowerCase();
			break;
		default:
			name = name.substring(0, 8);
			break;
		}
		

		System.out.println("This is after switch case.");
		
		System.out.println(name);
	}

}
