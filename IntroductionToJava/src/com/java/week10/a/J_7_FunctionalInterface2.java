package com.java.week10.a;

@FunctionalInterface
interface FunctInt2 {
	int add(int a, int b);
}

@FunctionalInterface
interface LambdaExpression {
	void calculatePower(int a, int b);
}

public class J_7_FunctionalInterface2 {

	public static void main(String[] args) {

		FunctInt2 reFunctInt2 = (a,b) -> a + b;
		
		System.out.println(reFunctInt2.add(4, 5));
		
		FunctInt2 reFunctInt22 = (a,b) -> {return a + b;};
		
		System.out.println(reFunctInt22.add(7, 9));
		
		LambdaExpression lambdaExpression = (a,b) -> {
			double power = Math.pow(a, b);
			System.out.println(power);
		};
		
		lambdaExpression.calculatePower(2, 5);
	}

}
