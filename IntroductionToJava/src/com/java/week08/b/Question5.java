package com.java.week08.b;

public class Question5 {
	
	static void getLongestString(String...strings) {
		if (strings.length > 0) {
			
			String longestString = strings[0];
			
			for (int i = 0; i < strings.length; i++) {
				if (strings[i].length() > longestString.length() ) {
					longestString = strings[i];
				}
			}
			for (String string : strings) {
				if (string.length() == longestString.length()) {
					System.out.println(string);
				}
			}
			
		} else {
			System.out.println("There is no word.");
		}
		
	}
	public static void main(String[] args) {

		getLongestString("mationauto", "house", "animal", "java", "automation");
		System.out.println("******************************");
		getLongestString();
	}

}
