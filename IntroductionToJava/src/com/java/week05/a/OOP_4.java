package com.java.week05.a;

public class OOP_4 {

	public static void main(String[] args) {
		
		CellPhone phone1 = new CellPhone();
		phone1.brand = "IPhone";
		phone1.OS = "IOS";
		phone1.RAM = 5;
		
		CellPhone phone2 = new CellPhone();
		phone2.brand = "Samsung";
		phone2.OS = "Android";
		phone2.RAM = 4;
		
		System.out.println(phone1.toString());
		System.out.println("**************************");
		System.out.println(phone2.toString());
	}

}

class CellPhone {
	// Fields
	String brand, OS;
	int RAM;
	
	// Methods
	
	public String toString() {
		return "Brand : " + brand + "\nOS : " + OS + "\nRAM : " + RAM;
	}
	
	void showPrice() {
		if (brand.equals("IPhone")) {
			System.out.println("Price is $1000");
		} else if (brand.equals("Samsung")) {
			System.out.println("Price is $600");
		} else if (brand.equals("Huawei")) {
			System.out.println("Price is $300");
		}
	}
	
	
}
