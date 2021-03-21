package com.java.week07.a;

// 1) Inheritance only works one way

// 2) Private properties won't be inherited by subclass

// 3) Non-private properties will be inherited from superclass to subclass

class SuperClass { // Parent Class
	int a = 3;
	private String str; // Can not be inherited by subclass
	
	void superMethod() {
		System.out.println("Super class method");
	}
}

class SubClass extends SuperClass { // Child Class 
	int c = 5;
	
	void subMethod() {
		System.out.println(a + "\n" + c);
		superMethod();
	}
}

public class InhertanceConcept1 {

	public static void main(String[] args) {

		new SubClass().subMethod();
		
	}

}
