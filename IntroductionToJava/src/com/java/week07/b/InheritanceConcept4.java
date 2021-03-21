package com.java.week07.b;

class SuperClass {
	int a;

	public SuperClass(int a) {
		this.a = a;
	}
}

class SubClass extends SuperClass{
	// Rule : In order to create subclass object, subclass constructor and superclass
	// constructors needs to match
	// If there is a constructor in superclass, we need to call it (super())
	public SubClass() {
		super(9); // invokes superclass constructor
	}
	
}

public class InheritanceConcept4 {

	public static void main(String[] args) {

		SubClass subClass = new SubClass();
		
		System.out.println(subClass.a);
		
	}

}
