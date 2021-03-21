package com.java.week07.b;

class SuperClass1 {
	
	int a;

	public SuperClass1(int a) {
		System.out.println("1");
		this.a = a;
	}
	
	public SuperClass1() {
		System.out.println("2");
		System.out.println("No parameter constructor of SuperClass.");
	}
}

class SubClass1 extends SuperClass1 {
	
	int b;
	
	public SubClass1() {
		// super(); // Here we don't see it. Secret.
		System.out.println("3");
		System.out.println("No parameter constructor of SubClass.");
	}
	
	public SubClass1(int b) {
		super(b);
		System.out.println("4");
	}
	
}

public class InheritanceConcept5 {

	public static void main(String[] args) {

//		new SubClass1(9);
		new SubClass1();
//		new SuperClass1(15);
//		new SuperClass1();
	}

}
