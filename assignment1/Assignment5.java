package com.celcom.assignment1;

import java.util.ArrayList;
import java.util.List;

class Book {
	private String title, author, isbn;

	public Book(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getIsbn() {
		return isbn;
	}

	@Override
	public String toString() {
		return "Book{" + "title='" + title + '\'' + ", author='" + author + '\'' + ", isbn='" + isbn + '\'' + '}';
	}

}

class Books {
	private List<Book> books;

	public Books() {
		books = new ArrayList<Book>();
	}

	public void addBook(Book book) {
		books.add(book);
		System.out.println("Added: " + book);
	}

	public void removeBook(String isbn) {

		Book booktoremove = null;

		for (Book book : books) {
			if (book.getIsbn().equals(isbn)) {
				booktoremove = book;
				break;
			}
		}

		if (booktoremove != null) {
			books.remove(booktoremove);
			System.out.println("Book Removed: " + booktoremove);
		} else {
			System.out.println("Book with ISBN " + isbn + " not found.");
		}

	}

	void displayBooks() {
		if (books.isEmpty()) {
			System.out.println("No Books are in the collection.");
		} else {
			System.out.println("Books in the collection:");
			for (Book book : books) {
				System.out.println(book);
			}
		}
	}

}

public class Assignment5 {

	public static void main(String[] args) {
		Books library = new Books();

		Book book1 = new Book("Goblet of Fire", "Harry Potter", "1234568912");
		Book book2 = new Book("1947", "Mechallem", "654738256473");

		library.addBook(book1);
		library.addBook(book2);

		library.displayBooks();

		library.removeBook("654738256473");

		library.displayBooks();

	}

}
