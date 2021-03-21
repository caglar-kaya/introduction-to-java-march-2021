package com.java.week08.b;

// Abstract classes are different kind of classes which can have 
// abstract methods

// 1) We can create method without body (abstract methods)
// 2) Abstract classes can not be instantiated (You can not create object)

// Why we are using abstract classes : It is creating a contract, so all
// abstract methods needs to be implemented in subclasses

// If you extend concrete class to abstract class, you need to override abstract methods

public class AbstractConcept1 extends Class1{

	@Override
	void method() {
		System.out.println("This is abstract class implementation.");
	}

}

abstract class Class1 {
	
	int a;
	
	abstract void method();
	
	void method2() {
		
	}
}
