package com.java.week06.a;
public class MyClass {
	int a;
	double b;
	String str;
	boolean check;
	
	public MyClass(int myInt, double myDouble, String myString, boolean myCheck) {
		this.a = myInt;
		this.b = myDouble;
		this.str = myString;
		this.check = myCheck;
	}
	public MyClass() { }
	
	void method1() {
		System.out.println(this.a + "\n" + this.b + "\n" + this.str + "\n" + this.check);
	}
	
	void method2(String string) {
		this.str = string;
	}
	
	void method3(boolean b) {
		this.check = b;
	}
	
	public static void main(String[] args) {
		MyClass ref = new MyClass(5, 3.7, "Caglar", true);
		ref.method1();
	}
}
