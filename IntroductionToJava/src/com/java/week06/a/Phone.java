package com.java.week06.a;

public class Phone {
	
	String brand;
	int price;
	
	public Phone(String brand, int price) {
		System.out.println("2 parameter constructor");
		this.brand = brand;
		this.price = price;
	}
	
	public Phone() {
		System.out.println("No parameter constructor");
	}
	
	public static void main(String[] args) {

		Phone phone1 = new Phone("Apple", 1000);
		System.out.println("Brand : " + phone1.brand + "\nPrice : " + phone1.price);
		
		Phone phone2 = new Phone();
		
	}
	
	

}
