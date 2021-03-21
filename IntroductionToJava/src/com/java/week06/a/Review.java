package com.java.week06.a;

public class Review {
	
	int number;
	String name;
	
	void method() {
		System.out.println(number);
		System.out.println(name);
	}

	public static void main(String[] args) {

		Review ref = new Review();
		ref.number = 9;
		ref.name = "Object1";
		System.out.println(ref.name);
		System.out.println(ref.number); 
		
		Review ref2 = new Review();
		System.out.println(ref2.number); // 0
		System.out.println(ref2.name); // null
		
		ref.method();
		ref2.method();
	}

}
