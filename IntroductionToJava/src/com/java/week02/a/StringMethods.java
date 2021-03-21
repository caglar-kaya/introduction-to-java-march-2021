package com.java.week02.a;

public class StringMethods {

	public static void main(String[] args) {
		/*
		length() // finds the length of string
		toUpperCase() // makes your letters all uppercase
		toLowerCase() // makes your letters all lowercase
		substring() // Extract substring from string
		charAt() // returns a single character at a specified location
		equals() // compare if two string is identical
		contains() --> finds if target string contains what is provided
		indexOf() --> Giving index number of specific character
		replace() --> Replace method replaces certain characters in a string
		concat() ---> Concatenation - writing strings side by side
		*/
		// 1. length()
		String string1 = "Selenium";
		System.out.println(string1.length());
		int len = string1.length();
		System.out.println(len);
		System.out.println("****************************");
		
		// 2. toUpperCase()
		String string2 = "Hello Java";
		System.out.println(string2.toUpperCase());
		System.out.println("Hello World".toUpperCase());
		System.out.println("****************************");

		// 3. toLowerCase()
		String string3 = "MAKE ME LOWERCASE";
		System.out.println("HELLO WORLD".toLowerCase());
		System.out.println(string3.toLowerCase());
		System.out.println("****************************");

		// 4. substring()
		// substring(int begining) - substring(int begining, int ending)
		String string4 = "SubstringFromMe";
		System.out.println(string4.substring(3));
		System.out.println(string4.substring(3,9));
		System.out.println("Selenium".substring(0, 5));
		System.out.println("****************************");

		// 5. charAt()
		String string5 = "Silicone Labs";
		System.out.println(string5.charAt(7));
		char character = string5.charAt(5);
		System.out.println(character);
		System.out.println("****************************");

		// 6. equals()
		String name1 = "Ahmet";
		String name2= "AHMET";
		System.out.println(name1.equals(name2));
		System.out.println(name1.equalsIgnoreCase(name2));
		System.out.println("****************************");

		// 7. contains()
		String string7 = "John";
		System.out.println(string7.contains("j"));
		System.out.println(string7.contains("J"));
		System.out.println(string7.contains("Jo"));
		System.out.println(string7.contains("hn"));
		System.out.println("****************************");

		// 8. indexOf()
		String string8 = "Postman API";
		System.out.println(string8.indexOf('P'));
		System.out.println(string8.indexOf("PI", 2));
		System.out.println("****************************");

		// 9. replace()
		String string9 = "Java";
		System.out.println(string9.replace('J', 'L').replace('a', 'x'));
		System.out.println(string9);
		System.out.println(string9.replace("va", "lo"));
		System.out.println("****************************");
		
		// 10. concat()
		String string10 = "Add me";
		System.out.println(string10.concat(" ").concat("something."));
		System.out.println("****************************");
		
		// 11. trim()
		System.out.print("$$$$$$$$$$$");
		String string11 = "  Java Classes       ";
		System.out.print(string11.trim());
		System.out.println("%%%");
		System.out.println("****************************");

		// 12. endsWith()
		String string12 = "Ahmet";
		System.out.println("Ahmet".endsWith("t"));
		System.out.println(string12.endsWith("T"));
		System.out.println("****************************");

		// 13. Example
		String myName = "Java";
		String newName = myName.substring(0,1)+'x'+myName.substring(2); // J + x + va
		System.out.println(newName); // Jxva
	}

}












