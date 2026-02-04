package com.tasks;
import java.util.Scanner;

public class Book {
	int bookId;
	String title;
	String author;
	double price;
	double discountPercentage;
	double discountAmount;
	double totalPrice;
	
	
	void m1() {
		Scanner sc = new Scanner(System.in);
		bookId=sc.nextInt();
		title = sc.nextLine();
		author=sc.nextLine();
		sc.nextLine();
		price=sc.nextDouble();
		discountPercentage=sc.nextDouble();
		sc.close();
		
	}
	void displayBookDetails() {
		
		discountAmount=price*(discountPercentage/100);
		totalPrice =price-discountAmount;
		System.out.println("BookId: "+bookId);
		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
		System.out.println("Price: "+price);
		System.out.println("DiscountPercentage: "+discountPercentage);
		System.out.println("DiscountAmount: "+discountAmount);
		System.out.println("TotalPrice "+totalPrice);
		
	}
	
	
public static void main(String[] args) {
	Book b1 = new Book();
	b1.bookId=1;
	b1.title="abcd";
	b1.author="praveen";
	b1.price=200;
	b1.discountPercentage=10;
	b1.displayBookDetails();
	
	System.out.println();
	
	Book b2 = new Book();
	b2.m1();
	b2.displayBookDetails();
	
}
}
