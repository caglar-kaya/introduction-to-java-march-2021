package com.java.preBootcamp;

public class IfElseBlocks {

	public static void main(String[] args) {
		
		boolean myBoolean = false;
		
		if (myBoolean) {
			System.out.println("This is if block.");
		} else {
			System.out.println("Else block.");
		}
		
		boolean myBoolean2 = true;
		
		if (myBoolean2) {
			System.out.println(1);
		}
		
		if (myBoolean2) {
			System.out.println(2);
		} else {
			System.out.println(3);
		}
		
		int age = 18;
		
		if (age >= 18) {
			System.out.println("You can vote");
		} else {
			System.out.println("You can not vote");
		}
		
		int number = 8;
		
		if (number % 2 == 0) {
			System.out.println(number + " is even number.");
		} else {
			System.out.println(number + " is odd number.");
		}
		
	}

}







































