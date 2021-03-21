package com.java.week06.a;

class Class1 {
	
	int a;
	double b;
	
	public Class1(int a, double b) {
		System.out.println("2 parameter constructor");
		this.a = a;
		this.b = b;
	}
	
	// Overloading a constructor
	public Class1() {
		System.out.println("No parameter constructor");
		this.a = 1;
		this.b = 1;
	}
	
	public Class1(int a) {
		System.out.println("1 parameter constructor");
		this.a = a;
	}
	
}

class Class2 {
	int a;
	double b;
}

public class ConstructorConcept {

	public static void main(String[] args) {

		Class1 ref = new Class1(7, 3.5);
		System.out.println(ref.a + "\n" + ref.b);
		
		Class1 ref2 = new Class1(43, 7.89);
		System.out.println(ref2.a + "\n" + ref2.b);
		
		Class1 ref3 = new Class1();
		System.out.println(ref3.a + "\n" + ref3.b);
		
		Class1 ref4 = new Class1(35);
		System.out.println(ref4.a + "\n" + ref4.b);
		
		Class2 obj = new Class2();
		System.out.println(obj.a + "\n" + obj.b);

	}

}
