package com.java.week05.a;

public class Review {

	public static void main(String[] args) {

		Class1 reference = new Class1();
		int a = reference.method(10, "Hello");
		System.out.println(a);
		Class1.method2();
	}

}

class Class1 {
	int method(int x, String message) {
		System.out.println("Message is : " + message);
		return x;
	}
	
	static void method2() {
		System.out.println("This is static method.");
	}
}


