package com.java.interviewQuestions;

public class Q_012_CallSuperMethod {
	
	public void superClassMethod() {
		System.out.println("I am super class method.");
	}

	public static void main(String[] args) {

		Subclass obj1 = new Subclass();
		obj1.superClassMethod();
		
	}

}

class Subclass extends Q_012_CallSuperMethod {
	

	public void superClassMethod() {
		super.superClassMethod();
		System.out.println("I am subclass method.");
	}
	
}
