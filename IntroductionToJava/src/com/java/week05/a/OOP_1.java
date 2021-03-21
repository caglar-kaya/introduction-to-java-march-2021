package com.java.week05.a;

public class OOP_1 {

	public static void main(String[] args) {

		Class reference = new Class();
		reference.method();
		reference.a = 10;
		System.out.println(reference.a);
		
		Class reference2 = new Class();
		reference2.a = 90;
		System.out.println(reference2.a);
		reference2.method2();
	}

}

class Class {
	int a;
	void method() {
		System.out.println("This is a method");
	}
	void method2() {
		System.out.println("This is a method2");
	}
}
