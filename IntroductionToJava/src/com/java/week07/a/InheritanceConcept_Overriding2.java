package com.java.week07.a;

class Shape {
	void findArea() {
		System.out.println("Finding Area");
	}
}

class Rectangle extends Shape {
	void method() {
		this.findArea();
		super.findArea();
	}
	void findArea() {
		System.out.println("Finding Area of Rectangle");
	}
}

class Circle extends Shape {
	void findArea() {
		System.out.println("Finding Area of Circle");
	}
}

public class InheritanceConcept_Overriding2 {

	public static void main(String[] args) {

//		Circle circle = new Circle();
//		circle.findArea(); // Finding Area of Circle
//		
//		Rectangle rectangle = new Rectangle();
//		rectangle.findArea(); // Finding Area of Rectangle
//		
//		Shape shape = new Shape();
//		shape.findArea(); // Finding Area
		
		Rectangle rectangle2 = new Rectangle();
		rectangle2.method();
	}

}
