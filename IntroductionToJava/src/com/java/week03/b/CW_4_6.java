package com.java.week03.b;

public class CW_4_6 {

	public static void main(String[] args) {
		
		String reverseMe = "Reverse Me";
		
		System.out.println();
		
		int i = reverseMe.length()-1;
		
		while (i >= 0) {
			System.out.print(reverseMe.charAt(i));
			i--;
		}
		
	}

}
