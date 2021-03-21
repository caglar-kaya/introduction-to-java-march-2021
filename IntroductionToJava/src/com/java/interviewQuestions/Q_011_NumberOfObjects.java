package com.java.interviewQuestions;

public class Q_011_NumberOfObjects {
	
	static int numberOfObjects;
	
	public Q_011_NumberOfObjects() {
		numberOfObjects++;
	}
	
	public Q_011_NumberOfObjects(int a) {
		numberOfObjects++;
	}
	public Q_011_NumberOfObjects(String s) {
		numberOfObjects++;
	}

	public static void main(String[] args) {

		Q_011_NumberOfObjects obj1 = new Q_011_NumberOfObjects();
		Q_011_NumberOfObjects obj2 = new Q_011_NumberOfObjects(8);
		Q_011_NumberOfObjects obj3 = new Q_011_NumberOfObjects("Ali");
		
		System.out.println("Number of Object: " + numberOfObjects);
		
	}

}
