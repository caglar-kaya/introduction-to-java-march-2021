package com.java.week07.b;
// this keyword is working like a reference for the current class
class SuperClass3 {
	
}

class SubClass3 extends SuperClass3 {
	
	int a = 4298;
	
	public SubClass3(int a) {
		this.a = a;
	}
	
	public SubClass3() {
		this(4000);
	}
	
	void method(int a) {
		System.out.println(a + this.a);
	}
	
	void method2() {
		method(100);
	}
}

public class ThisKeyword {

	public static void main(String[] args) {

		new SubClass3().method(9); // 4009
		new SubClass3().method2(); // 4100
		System.out.println(new SubClass3().a); // 4000
		
	}

}
