package com.java.week06.a;

public class InitializeObjects {
	
	int a;
	double b;
	
	public InitializeObjects(int a, double b) {
		this.a = a;
		this.b = b;
	}

	public InitializeObjects() {

	}
	
	void changeA(int a) {
		this.a = a;
	}

	public static void main(String[] args) {
		
		InitializeObjects ref1 = new InitializeObjects();
		// Direct Access
		ref1.a = 100;
		ref1.b = 42.98;
		
		// Create Constructor
		InitializeObjects ref2 = new InitializeObjects(9, 99.7);
		
		// Use method
		InitializeObjects ref3 = new InitializeObjects();
		ref3.changeA(38);
		
		
	}

}
