package com.java.interviewQuestions;

public class Q_015_Reverse {

	public static void main(String[] args) {
		// Create two method, one will reverse the string, 
		// one will reverse sentence word by word
		// StringBuilder stringBuilder = new StringBuilder();
		
		StringBuilder stringBuilder = reverseStringBuilder("SiliconeLabs");
		System.out.println(stringBuilder);
		
		System.out.println(reverseSentenceByWord("Caglar Kaya"));
		
	}
	
	static StringBuilder reverseStringBuilder(String string){
		StringBuilder stringBuilder = new StringBuilder(string);
		stringBuilder = stringBuilder.reverse();
		return stringBuilder;
	}
	
	static String reverseSentenceByWord(String string){
		String[] string2 = string.split(" ");
		String string3 = "";
		for (int i = string2.length-1; i >= 0; i--) {
			string3 += string2[i] + " ";
		}
		return string3.trim();
	}
	
}
