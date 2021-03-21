package com.java.week03.b;

public class CW_4_3 {

	public static void main(String[] args) {
		
		int i = 0, j = 7;
	
		while (i < 7) {
			while (j > i) {
				System.out.print("*");
				j--;
			}
			j = 7;
			System.out.println();
			i++;
		}
	
	}
	
}
