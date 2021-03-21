package com.java.week06.a;

class Class3 {
	
	int a;
	String bString;
	
	void setFields(int a, String bString) {
		this.a = a;
		this.bString = bString;
	}
	
}

public class Initializing_2 {

	public static void main(String[] args) {

		Class3 ref = new Class3();
		ref.setFields(9, "myString");
		System.out.println(ref.a);
		System.out.println(ref.bString);
		
	}

}
