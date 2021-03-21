package com.java.week07.a;

class A1 {
	// Blocks execute automatically when we create an object from class.
	{
		System.out.println(1);
	}
	{
		System.out.println("A1");
	}
}

class B1 extends A1 {
	// Both subclass and superclass blocks execute at the same time
	// when we create an object from subclass
	{
		System.out.println(2);
	}
	{
		System.out.println("B1");
	}
}

class C1 extends B1 {
	// Both subclass and superclass  and other uplevel superclasses 
	// blocks execute at the same time
	// when we create an object from subclass
	{
		System.out.println(3);
	}
	{
		System.out.println("C1");
	}
}

public class Blocks {

	public static void main(String[] args) {
		
		A1 obj = new A1();
		System.out.println("**********");
		B1 oB1 = new B1();
		System.out.println("----------");
		C1 c1 = new C1();
		
	}

}
