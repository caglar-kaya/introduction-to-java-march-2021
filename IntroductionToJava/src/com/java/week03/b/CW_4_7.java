package com.java.week03.b;

public class CW_4_7 {

	public static void main(String[] args) {

		int[] array = { 7, 2, 4, 5, 6, 7, 2, 6};
		
		int i = 0, j = 1;
		
		while (i < array.length) {
			
			while (j < array.length) {
				
				if (array[i] == array[j]) {
					System.out.println(array[i]);
				}
				
				j++;	
			}
			
			i++;
			
			j = i+1;
		}
		
	}

}


