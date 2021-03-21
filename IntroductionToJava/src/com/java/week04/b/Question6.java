package com.java.week04.b;

public class Question6 {

	static int countString(String str, String toFind) {
		int count = 0;
		while(str.contains(toFind)) {
			count++;
			str = str.substring(str.indexOf(toFind)+1);
		}
		return count;
	}
	
	public static void main(String[] args) {

		System.out.println(countString("crazy crayfish crushing craniums", "cra")); //3
		
		System.out.println(countString("sometimes solutions dont come on time", "me")); //4
		
		System.out.println(countString("I like Java although Java is harder than Python", "Java")); //2
	}
	
}
	

