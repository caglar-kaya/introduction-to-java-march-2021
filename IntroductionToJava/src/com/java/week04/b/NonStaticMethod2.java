package com.java.week04.b;

public class NonStaticMethod2 {

	public static void main(String[] args) {

		NonStaticMethod2 object = new NonStaticMethod2();
		String myBMI =object.bmiValue(63.0, 169.0);
		System.out.println(myBMI);
	}
	
	// BMI value
	public String bmiValue(double weight, double height) {
		double bmi = weight / (height * height);
		String result = "";
		if (bmi <= 18.5) {
			result = "Underweight";
		} else if (bmi <= 24.9) {
			result = "Normal Weight";
		} else if (bmi <= 29.9) {
			result = "Over Weight";
		} else if (bmi <= 34.9) {
			result = "Obesity Class I";
		} else if (bmi <= 39.9) {
			result = "Obesity Class II";
		} else {
			result = "Obesity Class III";
		}
		
		return result;
	}

}
