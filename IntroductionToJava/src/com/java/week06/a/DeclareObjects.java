package com.java.week06.a;

public class DeclareObjects {
	
	int a;
	
	void method() {
		System.out.println("Method");
	}
	

	public static void main(String[] args) {

		// First way to create object
		DeclareObjects ref1 = new DeclareObjects();
		
		// Second way
		DeclareObjects ref2 = new DeclareObjects(), ref3 = new DeclareObjects(),
				ref4 = new DeclareObjects();
		
		// Third way (Anonymous objects) (no reference)
		new DeclareObjects(); // Created and killed by Java
		new DeclareObjects().method();
	}
	
	

}
