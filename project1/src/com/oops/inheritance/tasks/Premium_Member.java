package com.oops.inheritance.tasks;

public class Premium_Member extends Library_Member{

	public Premium_Member(String bookName, int borrowed_books) {
		super(bookName, borrowed_books);
	}
	
	@Override
	public int calculateFee() {
		return getBorrowed_Books()*2;
	}

}
