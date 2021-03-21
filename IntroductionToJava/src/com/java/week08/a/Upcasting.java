package com.java.week08.a;

class SuperClass {
	int a = 19;
	void method() {
		System.out.println(a);
	}
	void method2() {
		System.out.println("1");
	}
}

class SubClass extends SuperClass {
	int a = 1900;
	void method() {
		System.out.println(a);
	}
	void method2() {
		System.out.println("2");
	}
	void method3() {
		System.out.println("3");
	}
}

public class Upcasting {

	// Up casting : Creating subclass object with superclass reference
	public static void main(String[] args) {

		System.out.println(new SubClass().a); // 1900
		
		SuperClass ref1 = new SuperClass();
		
		SubClass ref2 = new SubClass();
		
		SuperClass ref3 = new SubClass();
		
		// Upcasting : All the fields and methods will be belong to superclass
		// except overridden methods
	
		
		System.out.println(ref1.a); // 19
		System.out.println(ref2.a); // 1900
		System.out.println(ref3.a); // 19
		System.out.println("*****************");
		ref1.method(); // 19
		ref2.method(); // 1900
		ref3.method(); // 1900
		System.out.println("*****************");
		ref3.method2(); // 2
		// ref3.method3(); // Compiling error
		A a = new B();
		a.method(); // Europe
		System.out.println(ref3.a); // 19
		ref3.method2(); // 2
	}

}

class A {
	int i = 10;
	void method(){
		System.out.println("Europe"); 
	}
}
class B extends A {
	int i = 20;
	void method1(){
		System.out.println("USA");
	}
}

