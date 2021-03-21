package com.java.week06.b;

class Example {
	static int staticA;
	int nonStaticA;
	
	void increase() {
		staticA += 5;
		nonStaticA += 5;
	}
}

public class StaticConcept2 {

	public static void main(String[] args) {

		Example ref = new Example();
		Example ref2 = new Example();
		
		ref.increase(); // staticA = 5, ref.nonStaticA = 5, ref2.nonStaticA = 0
		ref.increase(); // staticA = 10, ref.nonStaticA = 10, ref2.nonStaticA = 0
		ref2.increase(); // staticA = 15, ref.nonStaticA = 10, ref2.nonStaticA = 5
		ref2.increase(); // staticA = 20, ref.nonStaticA = 10, ref2.nonStaticA = 10
		System.out.println("Reference 1 static A : " + Example.staticA);
		System.out.println("Reference 1 non static A : " + ref.nonStaticA);
		System.out.println("Reference 2 static A : " + Example.staticA);
		System.out.println("Reference 2 non static A : " + ref2.nonStaticA);

		
	}

}
