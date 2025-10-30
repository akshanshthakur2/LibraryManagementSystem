package com.Projects.LibraryManagementSystem;

public class Book {
	private static int counter=1;
	private int id;
	private String title;
	private String author;
	private boolean isAvailable;
	
	public Book(String title, String author) {
		this.id=counter++;
		this.title=title;
		this.author=author;
		this.isAvailable=true;
	}
	
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	
	public void isIssued() {
		isAvailable=false;
	}
	
	public void notIssued() {
		isAvailable=true;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", isAvailable=" + isAvailable + "]";
	}
	

	
}
