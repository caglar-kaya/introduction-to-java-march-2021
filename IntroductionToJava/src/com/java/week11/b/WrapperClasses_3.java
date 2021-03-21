package com.java.week11.b;

import java.util.ArrayList;

public class WrapperClasses_3 {

	public static void main(String[] args) {

		// Unboxing, Autoboxing
		
		// Unboxing is converting object to primitive data type
		
		// Autoboxing is converting primitive data type to object
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		arrayList.add(9); // Autoboxing : Primitive 9 turns into Integer Object
	
		int a = 4298;
		
		arrayList.add(a);
		
		int num = arrayList.get(0); // Unboxing : arraylist element will be stored in primitive variable
		
		
	}

}
