package com.tasks;

public class LibrarySystem {
	static int maxBooks;
	static int memberId=100;
	static int booksIssued;
	
	static{
		maxBooks=5;
	}
	
	
	{
		memberId++;
		
	}
	
	static void display() {
		System.out.println("====== Welcome to Library System ====== ");
		System.out.println("===== Each student must borrow up 5 books only =====");
		System.out.println();
		
	}
	
	void studentDetails() {
		System.out.println("MemberId:"+memberId);
		if(booksIssued<=5) {
			System.out.println("Books Issued:"+booksIssued);
		}else {
			System.out.println("Each student must borrow up 5 books only..");
		}
		System.out.println();
	}
	
	void main() {
		display();
		LibrarySystem l1=new LibrarySystem();
		booksIssued=3;
		l1.studentDetails();
		
		
		LibrarySystem l2=new LibrarySystem();
		booksIssued=4;
		l2.studentDetails();
		
		LibrarySystem l3=new LibrarySystem();
		booksIssued=14;
		l3.studentDetails();
		
		
		
	}
	
}
