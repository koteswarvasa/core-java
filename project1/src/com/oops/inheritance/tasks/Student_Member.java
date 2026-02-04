package com.oops.inheritance.tasks;

public class Student_Member extends Library_Member{

	public Student_Member(String bookName, int borrowed_books) {
		super(bookName, borrowed_books);
	}

	@Override
	public int calculateFee() {
		return getBorrowed_Books()*5;
	}

	
}
