package com.java.preBootcamp;

public class AssignmentOperators {

	public static void main(String[] args) {
		
		int x = 100;
		int y = 90;
		x = y;
		System.out.println(x); // 90
		System.out.println(y); // 90
		x = 80;
		System.out.println(x); // 80
		
		int a = 10;
		int b = 90;
		a += b; // a = a + b : 100
		System.out.println(a);
		System.out.println(b);
		
		int number1 = 42;
		int number2 = 98;
		
		number1 -= number2;
		System.out.println(number1);
		
		int number3 = 80, number4 = 3;
		number3 *= number4;
		System.out.println(number3);
		
		int number5 = 100, number6 = 3;
		number5 %= number6;
		System.out.println(number5);
		
		int m = 40, n = 5;
		m /= n;
		System.out.println(m);
		
		String name = "Ahmet";
		String lastName = " Can";
		
		name += lastName;
		System.out.println(name);
		
		
		
	}

}











































