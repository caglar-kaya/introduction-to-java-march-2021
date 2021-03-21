package com.java.week06.b;

public class Overview {
	
	int a;
	
	public Overview(int a) {
		System.out.println("This is one parameter constructor.");
		this.a = a;
	}

	public Overview() {
		System.out.println("This is non-parameter constructor.");
	}

	public static void main(String[] args) {

		Overview ref = new Overview();
		
		Overview ref2 = new Overview(5);
		
		System.out.println(ref.a);
		System.out.println(ref2.a);
		
	}

}
