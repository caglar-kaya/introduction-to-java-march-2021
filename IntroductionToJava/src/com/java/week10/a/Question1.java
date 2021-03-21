package com.java.week10.a;

@FunctionalInterface
interface PerformOperation {
	void isOdd(int a);
}

public class Question1 {

	public static void main(String[] args) {

		PerformOperation obj = (a) -> {
			if (a % 2 == 0) {
				System.out.println(a + " is Even.");
			} else {
				System.out.println(a + " is Odd.");
			}
		};
		
		obj.isOdd(5); // 5 is Odd.
		
		obj.isOdd(8); // 8 is Even.
	}

}
