package com.java.week08.b;

import java.util.Arrays;

// VarArgs : Variable Arguments

public class VariableArguments {
	
	// We are using Variable Arguments there might be different number of arguments
	// Parameter variable acts like an array
	
	// In one method, we can use only one varArgs
	// VarArgs have to be last parameter in the parameter list.
	static void method(String ... name) {
		System.out.println(Arrays.toString(name)); // name like an array
	}
	
	static void method2(int a, double b, String ... strings) {
		
	}
	public static void main(String[] args) {

		method();
		method("Ahmet");
		method("Ahmet", "Can");
		method("Ahmet", "Can", "Turk");
		
	}

}
