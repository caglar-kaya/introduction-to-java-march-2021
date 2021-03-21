package com.java.week07.a;

class A3 {
	int a;
	
	public A3(int a) {
		this.a = a;
		System.out.println(this.a);
	}

	public A3() {
		System.out.println("A3 non-parameter constructor.");
	}
}

class B3 extends A3 {
	int b;
	
	public B3(int b) {
		this.b = b;
		System.out.println(this.b);
	}

	public B3() {
		System.out.println("B3 non-parameter constructor.");
	}
}

class C3 extends B3 {
	int c;
	
	public C3(int c) {
		this.c = c;
		System.out.println(this.c);
	}

	public C3() {
		System.out.println("C3 non-parameter constructor.");
	}
}

public class Constructors {

	public static void main(String[] args) {

		A3 a3 = new A3(5);
		System.out.println("*************");
		B3 b3 = new B3(7);
		System.out.println("-------------");
		C3 c3 = new C3(9);
	}

}
