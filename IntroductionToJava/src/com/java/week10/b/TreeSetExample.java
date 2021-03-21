package com.java.week10.b;

import java.util.Iterator;
import java.util.TreeSet;

import javax.security.auth.x500.X500Principal;

public class TreeSetExample {
	
	static TreeSet<String> emails;

	public static void main(String[] args) {

		emails = new TreeSet<>();
		
		emails.add("abc@gmail.com");
		emails.add("def@siliconelabs.com");
		emails.add("ghi@siliconelabs.com");
		
		for (String string : emails) {
			System.out.println(string);
		}
		
		System.out.println();
		
		Iterator<String> iterator = emails.iterator();
		
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		
		System.out.println();
		
		emails.removeIf(x -> x.startsWith("a"));
		
		for (String string : emails) {
			System.out.println(string);
		}
		
	}

}
