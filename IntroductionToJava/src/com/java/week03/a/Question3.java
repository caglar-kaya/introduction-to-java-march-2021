package com.java.week03.a;

import java.util.Arrays;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
	    String sentence = input.nextLine();
	    
	    System.out.print(sentence.substring(sentence.lastIndexOf(" ")+1) + " ");
	    System.out.println();
	    String reversed = "";
	    
	    //TODO: start your code here
	    String [] arraySentence = sentence.split(" ");
	    
	    System.out.println(Arrays.toString(arraySentence));
	    
	    for (int i = arraySentence.length-1; i >= 0 ; i--) {
			reversed += arraySentence[i] + " ";
		}
	    
	    //End your code here. do not modify below statement
	    
	    System.out.println("Reversed: " + reversed.substring(0,reversed.length()-1));
	}

}
