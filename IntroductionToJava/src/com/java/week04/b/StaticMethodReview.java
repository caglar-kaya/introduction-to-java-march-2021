package com.java.week04.b;

public class StaticMethodReview {
//  access modifier						: private, public, default, protected
//		^	access specifier			: static-non-static
//		^	 ^	return type				: void-All Data Types
//		^    ^     ^    Method name
//		^    ^     ^    ^     parameter
//		^    ^     ^    ^        ^
	public static void main(String[] args) {
		// Method signature : method name and arguments
		// Method body		: collection of statements between curly bracelets
		// Method header	: Method header is here; public static void main(parameters)
		
		//		Argument
		method("\nAhmet");
	}
		
	//					Parameter
	static void method(String name) {
		System.out.println(name);
	}

}
