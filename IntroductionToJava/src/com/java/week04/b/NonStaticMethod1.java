package com.java.week04.b;

import java.util.Scanner;

public class NonStaticMethod1 {

	public static void main(String[] args) {
		//		  reference
		//			^		 OBJECT
		 Scanner scanner = new Scanner(System.in);
		 
		 NonStaticMethod1 reference1 = new NonStaticMethod1();
		 reference1.printMessage("Ahmet");
		 
		 reference1.printNumber(10);
		 
		 int number = reference1.returnNumber(155);
		 System.out.println(number);
		 
		 int[] arr = {1,2,3,4,5};
		 reference1.printArray(arr);
		 
		 System.out.println();
		 
		 String[] arr2 = {"Ali","Veli"};
		 reference1.printArray(arr2);
		 
	}
	
	void printMessage(String message) {
		System.out.println(message);
	}
	
	void printNumber(int limit) {
		for (int i = 0; i < limit; i++) {
			System.out.println(i);
		}
	}
	
	int returnNumber(int a) {
		return a;
	}
	
	void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	void printArray(String[] arr2) {
		for (int i = arr2.length-1; i >= 0; i--) {
			System.out.print(arr2[i] + " ");
		}
	}

}











