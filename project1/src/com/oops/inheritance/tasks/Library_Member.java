package com.oops.inheritance.tasks;

public class Library_Member {
	private String bookName;
	private int borrowed_Books;

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBorrowed_Books() {
		return borrowed_Books;
	}

	public void setBorrowed_Books(int borrowed_Books) {
		this.borrowed_Books = borrowed_Books;
	}

	public Library_Member(String bookName, int borrowed_Books) {
		super();
		this.bookName = bookName;
		this.borrowed_Books = borrowed_Books;
	}

	public int calculateFee() {
		return 0;
	}

}
