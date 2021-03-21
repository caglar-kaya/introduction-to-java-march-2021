package com.java.week08.b;

abstract class Shape1 {
	abstract void findArea();
}

class Square extends Shape1 {
	int side;
	public Square(int side) {
		this.side = side;
	}
	@Override
	void findArea() {
		System.out.println(side * side);
	}
}

class Rectangle1 extends Shape1 {
	int length, width;
	public Rectangle1(int length, int width) {
		this.length = length;
		this.width = width;
	}
	@Override
	void findArea() {
		System.out.println(length * width);
	}
	
}

public class AbstractConcept2 {

	public static void main(String[] args) {

		Shape1 ref, ref2;
		
		ref = new Square(4);
		ref.findArea();
		
		ref2 = new Rectangle1(3, 5);
		ref2.findArea();
	}

}













