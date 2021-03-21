package com.java.week06.b;

public class BookStore {
	
	static int crimeInventory = 100, comicsInventory = 100, biographyInventory = 100;
	static int crimePrice = 8, comicsPrice = 10, biographyPrice = 12;
	int crimeCustomerResult, comicsCustomerResult, biographyCustomerResult;
	static int customerNumber;
	
	void totalPrice() {
		int totalPrice;
		totalPrice = ( crimeCustomerResult * crimePrice ) 
					+ ( comicsCustomerResult * comicsPrice )
					+ ( biographyCustomerResult * biographyPrice );
		System.out.println("Your Total Price : " + totalPrice);
	}
	
	void buyCrimeBooks(int amount) {
		if (amount <= crimeInventory) {
			crimeCustomerResult += amount;
			System.out.println("\nYou bought " + amount + " crime books.");
			crimeInventory -= amount;
		} else {
			System.out.println("\nMaximum " + crimeInventory + " Crime Books Available");
		}
	}
	
	void returnCrimeBook(int amount) {
		if (crimeCustomerResult >= amount) {
			crimeCustomerResult -= amount;
			System.out.println("\nYou returned " + amount + " crime books.");
			crimeInventory += amount;
		} else {
			System.out.println("\nYou can not return more than you bought.");
		}
	}

	void buyComicsBooks(int amount) {
		if (amount <= comicsInventory) {
			comicsCustomerResult += amount;
			System.out.println("\nYou bought " + amount + " comics books.");
			comicsInventory -= amount;
		} else {
			System.out.println("\nMaximum " + comicsInventory + " Comics Books Available");
		}
	}
	
	void returnComicsBook(int amount) {
		if (comicsCustomerResult >= amount) {
			comicsCustomerResult -= amount;
			System.out.println("\nYou returned " + amount + " comics books.");
			comicsInventory += amount;
		} else {
			System.out.println("\nYou can not return more than you bought.");
		}
	}
	
	void buyBiographyBooks(int amount) {
		if (amount <= biographyInventory) {
			biographyCustomerResult += amount;
			System.out.println("\nYou bought " + amount + " biography books.");
			biographyInventory -= amount;
		} else {
			System.out.println("\nMaximum " + biographyInventory + " Biography Books Available");
		}
	}
	
	void returnBiographyBook(int amount) {
		if (biographyCustomerResult >= amount) {
			biographyCustomerResult -= amount;
			System.out.println("\nYou returned " + amount + " biography books.");
			biographyInventory += amount;
		} else {
			System.out.println("\nYou can not return more than you bought.");
		}
	}
	
	public BookStore() {
		customerNumber++;
	}
	
	static void showStoreResult() {
		System.out.println("\nResults for Book Store : " 
							+ "\n\nTotal Number of Crime Books : " + crimeInventory
							+ "\nTotal Number of Comics Books : " + comicsInventory
							+ "\nTotal Number of Biography Books : " + biographyInventory
							+ "\nTotal Number of Customers : " + customerNumber);
	}
	void showCustomerResult() {
		System.out.println("\nResults for Customer : "
		+ "\n\nTotal Number of Crime Books that You Have : " + crimeCustomerResult
		+ "\nTotal Number of Comics Books that You Have : " + comicsCustomerResult
		+ "\nTotal Number of Biography Books that You Have : " + biographyCustomerResult);
		totalPrice();
	}
	
	public static void main(String[] args) {

		BookStore customer1 = new BookStore(), customer2 = new BookStore(), 
				customer3 = new BookStore(), customer4 = new BookStore();
		
		customer1.buyCrimeBooks(130);		// Maximum 100 Crime Books Available
		customer1.buyCrimeBooks(30); 		// You bought 30 crime books.
		customer1.returnCrimeBook(35);		// You can not return more than you bought.
		customer1.returnCrimeBook(27); 		// You returned 27 crime books.
		customer1.buyComicsBooks(15);		// You bought 15 comics books.
		customer1.returnComicsBook(8);		// You returned 8 comics books.
		customer1.buyBiographyBooks(25);	// You bought 25 biography books.
		customer1.returnBiographyBook(15);	// You returned 15 biography books.
		
		customer1.showCustomerResult();
		BookStore.showStoreResult();
		
	}

}
