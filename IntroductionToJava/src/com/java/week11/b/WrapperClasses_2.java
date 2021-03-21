package com.java.week11.b;

public class WrapperClasses_2 {

	public static void main(String[] args) {

		String string = "1000";
		
		Integer integer = Integer.parseInt(string);
		
		System.out.println(integer / 2); // 500
		
		Double double1 = Double.parseDouble(string);
		
		System.out.println(double1 / 2); // 500.0
	}

}
