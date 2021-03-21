package com.java.week03.b;

public class CW_4_5 {

	public static void main(String[] args) {

		int i = 0, j = 0;
		
		while (i < 6) {
			
			System.out.print("$");
			
			while (j < i) {
				System.out.print(" ");
				j++;
			}
			
			j = 0;
			System.out.println("$");
			
			i++;
		}
		
	}

}
