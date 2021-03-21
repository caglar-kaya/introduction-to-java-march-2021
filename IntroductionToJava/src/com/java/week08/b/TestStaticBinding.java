package com.java.week08.b;

/*
 *	STATIC BINDING :
 *	- Binding which can be resolved at COMPILE TIME by compiler.
 *	- Also called EARLY BINDING.
 *	- Binding happens before a program actually runs.
 *	- Example : Method OVERLOADING
 *
 *  DYNAMIC BINDING : 
 *  - When compiler is NOT able to resolve the binding at compile time.
 *  - Also called LATE BINDING.
 *  - Binding happens during RUN TIME.
 *  - Example : Method OVERRIDING
 */

public class TestStaticBinding {
	
	void area(float r) { // Overloaded method
		float a;
		a = 3.1416f * r * r;
		System.out.println("Area of Circle : " + a);
	}
	
	void area(float a, float b) { // Overloading method
		float m;
		m = a * b;
		System.out.println("Area of Rectangle : " + m);
	}

	public static void main(String[] args) {
		
		TestStaticBinding t = new TestStaticBinding();
		
		t.area(5); 		// resolved at COMPILE TIME by compiler.
		
		t.area(7, 9);	// resolved at COMPILE TIME by compiler.
		
	}

}
