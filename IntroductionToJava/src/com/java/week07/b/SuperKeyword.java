package com.java.week07.b;
// Super Keyword is working like a reference for superclass
// 1) We are using it to call superclass field
// 2) Calling superclass method
// 3) invoking super() class constructor

class SuperClass2 {
	int a = 4298;
	
	void method() {
		System.out.println(1);
	}
}

class SubClass2 extends SuperClass2 {
	int a = 4306;
	
	void method() {
		System.out.println(a); // 4306
		System.out.println(super.a); // 4298
	}
	
	void method2() {
		method();
		super.method();
	}
}

public class SuperKeyword {

	public static void main(String[] args) {

		SubClass2 obj = new SubClass2();
		obj.method();
		obj.method2();
	}

}
