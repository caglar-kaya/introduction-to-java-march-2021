package com.java.week08.b;

// BINDING : Linking between 'method call' and 'method definition'.

public class Binding {
	
	void m1() {
		System.out.println("m1 invoked");
	}
	
	void m2() {
		System.out.println("m2 invoked");
	}

	public static void main(String[] args) {

		Binding obj = new Binding();
		
		obj.m1();
		
		obj.m2();
	}

}
