package com.java.week07.a;

class A {
	int a = 10;
	
	void a() {
		System.out.println("a : " + a);
	}
}

class B extends A {
	int b = 20;
	
	void b() {
		System.out.println("b : " + b);
	}
}

class C extends B {
	int c = 30;
	
	void c() {
		System.out.println("c : " + c);
	}
}

public class InheritanceConcept2 {

	public static void main(String[] args) {

		C c = new C();
		c.a();
		c.b();
		c.c();
		
	}

}
