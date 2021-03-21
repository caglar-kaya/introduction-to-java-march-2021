package com.java.interviewQuestions;

public class Q_010_SwapStrings {

	public static void main(String[] args) {

		String str1 = "Ali";
		String str2 = "Veli";
		
		System.out.println("Before swap:" + "\nstr1: " + str1 + "\nstr2: " + str2);
		
		str1 = str1.concat(str2); // str1 = AliVeli
		str2 = str1.substring(0, (str1.length() - str2.length())); // str2 = Ali
		str1 = str1.substring(str2.length()); // str1 = Veli
		
		System.out.println("\nAfter swap:" + "\nstr1: " + str1 + "\nstr2: " + str2);

 
		
		//  Write a Java program to swap two strings without using temp or third variable?
		//System.out.println(swapString("ahmet", "mehmet"));
		

	}
		public static String swapString(String s1, String s2) {
			return s1.replaceAll(String.valueOf(s1), s2) + " " + s1;
		}
}


