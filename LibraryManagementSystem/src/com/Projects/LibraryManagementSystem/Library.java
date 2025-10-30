package com.Projects.LibraryManagementSystem;

import java.util.ArrayList;

public class Library {
	private ArrayList<Book> books= new ArrayList<Book>();
	
	public void addBook(String title, String author) {
		Book newBook= new Book(title, author);
		books.add(newBook);
		System.out.println("\nBook added Succesfully!");
	}
	
	public void displayBook() {
		if(books.isEmpty()) System.out.println("No books in the Library..");
		else {
			for(Book b: books) {
				System.out.println(b);
			}
		}
	}
	
	public void issueBook(String title) {
		for(Book b: books) {
			if(b.getTitle().equalsIgnoreCase(title)) {
				if(b.isAvailable()) {
					b.isIssued();
					System.out.println("\n"+title+" is successfully Issued!...");					
				}else System.out.println("\n"+title+" is not Available!...");
				return;
			}
		}
		System.out.println("\nBook is not Available in the Library...");
	}
	
	public void returnBook(String title) {
		for(Book b: books) {
			if(b.getTitle().equalsIgnoreCase(title)) {
				if(!b.isAvailable()) {
					b.notIssued();
					System.out.println("\n"+title+" is returned succesfully!...");
					
				}else System.out.println("\n"+title+" was not Issued!...");
				return;
			}
		}
		System.out.println("\nBook is not Available in the Library...");
	}
	
}
