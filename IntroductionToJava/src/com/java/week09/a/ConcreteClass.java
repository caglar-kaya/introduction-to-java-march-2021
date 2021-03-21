package com.java.week09.a;

interface Interface {
	
	// Interface can have abstract method, but NOT concrete method
	
	// After Java 8 : Interface can have DEFAULT and STATIC method
	
	// We can NOT instantiate interface.
	
	// We can NOT create constructor.
	
	int a = 9; // final, static, and public by default.
	
	void method(); // abstract and public by default
	
	static void method1() {
		
	}
	
	default void method2() { // If we want to implement the method in interface
							 // we can create default method
	}
}

abstract class AbstractClass {
	// We can NOT instantiate the abstract classes (Although there is constructor..)
	// We can create abstract methods
	
	int a;

	public AbstractClass(int a) {
		this.a = a;
	}
	
}

public class ConcreteClass { // Normal class : Concrete Class

	
}
