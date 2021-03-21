package com.java.week01.b;

public class J_3_IfElseOverview {

	public static void main(String[] args) {
		
		boolean myBoolean = true;
		
		if (!myBoolean) {
			System.out.println("If Block");
		} else {
			System.out.println("Else Block");
		}
		
		int a = 42, b = 98;
		
		if (a == b) {
			System.out.println("a = b");
		} else {
			System.out.println("a != b");
		}
		
		int x = 9;
		boolean value = true;
		System.out.println("x: " + x);
		
		if (value) {
			x *= 2;
		} else {
			x *= 3;
		}
		
		System.out.println("x: " + x);
		
		
	}

}














