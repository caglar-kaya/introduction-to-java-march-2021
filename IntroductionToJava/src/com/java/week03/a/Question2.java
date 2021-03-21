package com.java.week03.a;

import java.util.Arrays;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
	    Scanner input = new Scanner(System.in);
	    
	    String[] words = {input.nextLine(),input.nextLine(),
	    		input.nextLine(),input.nextLine(),input.nextLine()};
	    //TODO: Write your code below
	    
	    System.out.println(Arrays.toString(words));
	    
for (int i = 0; i < words.length; i++) {
	System.out.println(words[i].charAt(0) + "" + words[i].charAt(words[i].length()-1));
}
	    
	}

}
