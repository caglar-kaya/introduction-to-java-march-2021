package com.java.week07.a;

// If subclass and superclass have same name for a method, we call it overriding

class Parent {
	void speaks() {
		System.out.println("Do your homeworks");
	}
}

class Child extends Parent {
	void speaks() {
		System.out.println("I want to play game");
	}
	
	void eat() {
		System.out.println("I eat chocolate");
	}
}

public class InheritanceConcept_Overriding {

	public static void main(String[] args) {
		
		Parent parent = new Parent();
		parent.speaks();
		
		Child child = new Child();
		child.speaks();
		
		Parent child2 = new Child();
		// child2.eat(); // The method eat() is undefined for the type Parent

		
	}

}
