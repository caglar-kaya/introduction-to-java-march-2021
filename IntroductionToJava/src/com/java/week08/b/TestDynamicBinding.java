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

class Shape {
	void draw() {
		System.out.println("No shape");
	}
}
class Rectangle extends Shape {
	void draw() {
		System.out.println("Drawing rectangle");
	}
}
class Circle extends Shape {
	void draw() {
		System.out.println("Drawing circle");
	}
}
class Triangle extends Shape {
	void draw() {
		System.out.println("Drawing triangle");
	}
}
public class TestDynamicBinding {

	public static void main(String[] args) {

		Shape s;
		s = new Shape();
		s.draw();
		s = new Rectangle();
		s.draw();
		s = new Circle();
		s.draw();
		s = new Triangle();
		s.draw();
	}

}








