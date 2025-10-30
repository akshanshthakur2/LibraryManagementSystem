package com.Projects.LibraryManagementSystem;

import java.util.Scanner;

public class LibraryManagement {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Library library = new Library();
		boolean exit = false;

		while (!exit) {
			System.out.println("\n----------------------------------\n");
			System.out.println("===Library Management System===\n");
			System.out.println("1. Add book in the library");
			System.out.println("2. Display all Books");
			System.out.println("3. Borrow book from the library");
			System.out.println("4. Return book to the library");
			System.out.println("5. Exit");
			System.out.println("\nEnter your choice: ");

			int n = sc.nextInt();
			sc.nextLine();
			switch (n) {
			case 1: 
				addBookToLib(library);
				break;
			case 2: 
				disBooks(library);
				break;
			case 3: 
				borrowBook(library);
				break;
			case 4: 
				retBook(library);
				break;
			case 5: 
				exit=true;
				System.out.println("\nThankyou.. exiting!");
				break;
			default: System.out.println("\nInvalid Input.. Try Again!");
			}
		}
		
	}
	public static void addBookToLib(Library library) {
		System.out.println("Enter Title of Book: ");
		String title= sc.nextLine();
		System.out.println("Enter Author of Book: ");
		String author= sc.nextLine();
		library.addBook(title, author);
	}
	public static void disBooks(Library library) {
		library.displayBook();
	}
	public static void borrowBook(Library library) {
		System.out.println("Enter Title of Book: ");
		String title= sc.nextLine();
		library.issueBook(title);
	}
	public static void retBook(Library library) {
		System.out.println("Enter Title of Book: ");
		String title= sc.nextLine();
		library.returnBook(title);
	}
}
