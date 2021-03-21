package com.java.week04.b;

public class Question2 {

	static String makeThreeSubstr(String word, int startIndex, int endIndex) {
		String result = "";
		for (int i = 0; i < 3; i++) {
			result += word.substring(startIndex, endIndex);
		}
		return result;
	}
	
	public static void main(String[] args) {

		System.out.println(makeThreeSubstr("hello",0,2));
		System.out.println(makeThreeSubstr("shenanigans",3,7));
		
	}

}
