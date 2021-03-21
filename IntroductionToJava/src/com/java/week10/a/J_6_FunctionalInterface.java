package com.java.week10.a;

@FunctionalInterface // annotation
interface FunctInter {
	// Functional interfaces can have only one abstract method
	void print();
}

public class J_6_FunctionalInterface {

	public static void main(String[] args) {
		
		// Anonymous Class
		FunctInter reFunctInter = new FunctInter() {
			
			@Override
			public void print() {
				System.out.println("Hello World");
			}
		};
		
		reFunctInter.print();
		
		// Lambda Expressions
		FunctInter reFunctInter2 = () -> {System.out.println("Hello World");};
		
		reFunctInter2.print();
	}

}
