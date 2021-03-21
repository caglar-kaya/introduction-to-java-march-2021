package com.java.week07.b;

class A {
	
	int a = 4298;
	String name = "Ahmet";
}

public class Composition {
	
	A aObject = new A();

	public static void main(String[] args) {

		Composition compObject = new Composition();
		
		System.out.println(compObject.aObject.a);
	}

}
