package com.java.week04.b;

public class ClassStructure {
	//Files can contain more than one class
	// In one file there can be ONLY ONE PUBLIC CLASS
	
	public static void main(String[] args) {
		// Calling Static method from another class
		Second.method1();
		
		// Calling Non-Static method from another class
		Second reference = new Second();
		reference.method2();
	}
	
}

class Second {
	
	void method2() {
		System.out.println("2");
	}
	static void method1() {
		System.out.println("1");
	}
	
}