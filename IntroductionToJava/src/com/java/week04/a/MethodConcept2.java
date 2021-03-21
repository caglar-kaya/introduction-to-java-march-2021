package com.java.week04.a;

public class MethodConcept2 {
	
	static String fullName(String name, String lastName) {
		String fullName = name + " " + lastName;
		System.out.println("Full Name Method is Working..");
		return fullName;
	}

	public static void main(String[] args) {

		System.out.println(fullName("Caglar", "Kaya"));
		
		
	}

}
