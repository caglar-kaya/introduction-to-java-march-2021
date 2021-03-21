package com.java.week09.a;

interface Interface2 {
	
	int a = 90;
	
	void abstractMethod();
	
	default void defaultMethod2() {
		System.out.println("Default method.");
	}
}

class Subclass implements Interface2 {

	@Override
	public void abstractMethod() {
		System.out.println("Abstract method implementation in subclass");
	}
	
}

public class InterfaceConcept1 {

	public static void main(String[] args) {

		Interface2 ref;
		
		ref = new Subclass();
		ref.abstractMethod();
		
		System.out.println(ref.a);
	}

}
