package com.java.week09.a;

interface A {
	
	int a = 90;
	
	void abstract1();
}

interface B extends A {
	
	int b = 80;
	
	void abstract2();
}

class C implements B {
	
	int c = 70;

	@Override
	public void abstract1() {
		System.out.println("Abstract1");
	}

	@Override
	public void abstract2() {
		System.out.println("Abstract1");		
	}
}

public class InterfaceConcept2 {

	public static void main(String[] args) {

		A ref = new C();
		
		B ref2 = new C();
		
		System.out.println(ref.a); // 90
		// System.out.println(ref.b); 
		System.out.println(ref2.a); // 90
		
		C ref3 = new C();
		System.out.println(ref3.a); // 90
		
	}

}
