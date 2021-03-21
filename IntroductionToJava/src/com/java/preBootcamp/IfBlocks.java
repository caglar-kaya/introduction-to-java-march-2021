package com.java.preBootcamp;

public class IfBlocks {

	public static void main(String[] args) {
		
		if (true) {
			System.out.println("Silicone Labs 1");
			System.out.println("Silicone Labs 2");
		}
		
		int x = 10;
		if (false) // { olmadigindan sadece sonraki tek bir satiri etkiler.
					// true ise calistirir, false ise calistirmaz.
			x = 100; // doesn't work
			x = 99; // this line works
		System.out.println(x); // 99
		
		int age = 18;
		
		if (age >= 18) {
			System.out.println("You can vote.");
		}
		
		boolean myUserName = true;
		
		if (myUserName) {
			System.out.println("Welcome");
		}
		
		boolean verifyTitle = false;
		
		if (verifyTitle) {
			System.out.println("Title verified.");
		}
		
		

	}

}
