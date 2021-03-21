package com.java.week08.a;

class MyClass {
	// Encapsulation : making the fields private
	private int a;
	
	public MyClass(int a) {
		this.a = a;
	}
	
	public void setA(int a) {
		this.a = a;
	}
	
	public int getA() {
		return a;
	}
}

public class MyClassTester {

	public static void main(String[] args) {

		MyClass ref = new MyClass(20);
		//System.out.println(ref.a);
		System.out.println(ref.getA());
		
		// Directly
//		ref.a = 9;
//		System.out.println(ref.a);
		
		ref.setA(30);
		//System.out.println(ref.a);
		System.out.println(ref.getA());
		
	}

}
