package com.java.week06.a;

public class Car {
	String make, model; int numberOfDoors, topSpeed; double price;
	public Car(String make, String model, int topSpeed, double price) {
		this.numberOfDoors = 4; // Default
		this.make = make;
		this.model = model;
		this.topSpeed = topSpeed;
		this.price = price;
	}
	public Car(int numberOfDoors, int topSpeed, double price) {
		this.make = "unknown"; // Default
		this.model = "unknown"; // Default
		this.numberOfDoors = numberOfDoors;
		this.topSpeed = topSpeed;
		this.price = price;
	}
	public Car(String make, String model, int numberOfDoors, int topSpeed, double price) {
		this.make = make;
		this.model = model;
		this.numberOfDoors = numberOfDoors;
		this.topSpeed = topSpeed;
		this.price = price;
	}
	public Car(String make, String model, int numberOfDoors) {
		this.topSpeed = 90; // Default
		this.price = 0; // Default
		this.make = make;
		this.model = model;
		this.numberOfDoors = numberOfDoors;
	}
	void print() {
		System.out.println("Make : " + this.make 
							+ "\nModel : " + this.model
							+ "\nNumber of Doors : " + this.numberOfDoors
							+ "\nTop Speed : " + this.topSpeed
							+ "\nPrice : " + this.price
						  );
	}
	
	public static void main(String[] args) {

		Car car1 = new Car("Mercedes", "CLK", 5, 300, 40000);
		car1.print();
		System.out.println("**************************");
		
		Car car2 = new Car("Renault", "Laguna", 250, 20000);
		car2.print();
		System.out.println("**************************");

		Car car3 = new Car(2, 180, 5000);
		car3.print();
		System.out.println("**************************");

		Car car4 = new Car("Audi", "A3", 5);
		car4.print();
		System.out.println("**************************");
		
	}

}



 