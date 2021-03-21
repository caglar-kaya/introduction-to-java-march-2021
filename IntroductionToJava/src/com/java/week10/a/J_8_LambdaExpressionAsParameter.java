package com.java.week10.a;

import java.util.ArrayList;
import java.util.function.Consumer;

public class J_8_LambdaExpressionAsParameter {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(4298);
		numbers.add(4299);
		numbers.add(4300);
		numbers.add(4305);
		numbers.add(4306);
		
		Consumer<Integer> obj = (n) -> {System.out.println(n);};
		
		numbers.forEach(obj);
		
		numbers.forEach(num->System.out.println(num));
	}

}
