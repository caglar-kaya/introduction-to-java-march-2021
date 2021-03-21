package com.java.week07.b;

import java.util.ArrayList;
import java.util.Arrays;

class Book {
	String author;
	String title;
	int price;
	public Book(String author, String title, int price) {
		this.author = author;
		this.title = title;
		this.price = price;
	}
}

class Bookstore {
	ArrayList<Book> booklist = new 
			ArrayList<>(Arrays.asList(new Book("Mehmet Akif Ersoy", "Safahat", 20), 
					new Book("Elif Safak", "Ask", 40)));
	
	void buyBook(String name) {
		for (Book book : booklist) {
			if (book.title.equalsIgnoreCase(name)) {
				System.out.println(name + " is available in our inventory.");
				System.out.println(name + " costs " + book.price);
				break;
			}
			
		}
	}
}

public class Composition2 {

	public static void main(String[] args) {

		Bookstore obj = new Bookstore();
		obj.buyBook("Angels and Demons");
		obj.buyBook("safahat");
	}

}
