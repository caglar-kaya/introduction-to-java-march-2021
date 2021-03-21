package com.java.week06.a;

public class BankAccount {
	
	double balance;
	String customerName;
	String bankAccountNumber;
	
	public BankAccount(String customerName, String bankAccountNumber) {
		this.customerName = customerName;
		this.bankAccountNumber = bankAccountNumber;
	}
	
	// Withdraw money
	void deposit(double amount) {
		balance += amount;
	}
	
	public static void main(String[] args) {

		BankAccount customer1 = new BankAccount("Ahmet", "DE35-5674");
		customer1.deposit(150);
		System.out.println(customer1.balance);
		
		BankAccount customer2 = new BankAccount("Ali", "FA35-5627");
		customer2.deposit(270);
		System.out.println(customer2.balance);
	}
	
}
