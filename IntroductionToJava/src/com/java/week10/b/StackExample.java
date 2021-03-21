package com.java.week10.b;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		
		// Collection type which works in last-in-first-out data structure
		// stack is the subclass of Vector
		
		Stack<String> stack = new Stack<>();
		
		stack.push("Silicone");
		stack.push("Labs");
		stack.push("School");
		
		stack.pop();
		stack.pop();
		
		for (String string : stack) {
			System.out.println(string);
		}

	}

}
