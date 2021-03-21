package com.java.week04.a;

public class AccessModifiers {

	public static void main(String[] args) {

		// Calling the static method from another class
		
		// Public, private, default(empty), protected
		// Public : You can call public methods from anywhere in the project
		// private : You can private method only from inside of that class
		// default : You can access to the method only from same package
		
		MethodConcept3.reverseString("Hello");
		System.out.println(MethodConcept2.fullName("Caglar", "Kaya"));
		System.out.println(Math.pow(2, 4));
	}

}
