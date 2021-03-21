package com.java.week06.a;
public class Dog {
	String name;
	String breed;
	double weight;
	public Dog(String name, String breed, double weight) {
		this.name = name;
		this.breed = breed;
		this.weight = weight;
	}
	public Dog(String name, double weight) {
		this.breed = "Mutt";
		this.name = name;
		this.weight = weight;
	}
	void print() {
		System.out.println("Name : " + this.name 
							+ "\nBreed : " + this.breed
								+ "\nWeight : " + this.weight);
	}
	
	public static void main(String[] args) {
		Dog dog1 = new Dog("Lessy", "Unknown", 30);
		System.out.println("Name : " + dog1.name);
		System.out.println("Breed : " + dog1.breed);
		System.out.println("Weight : " + dog1.weight);
		
		System.out.println("********************");
		
		Dog dog2 = new Dog("Karabas", 40);
		dog2.print();
		
	}

}
