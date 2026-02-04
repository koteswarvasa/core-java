package com.tasks;

public class ShoppingCart {
	String itemName;
	double price;
	int quantity;
	double total;
	double discountAmount;
	
	void calculateTotal() {
		System.out.println("original price is:"+total);
	}
	
	
	void applyDiscount() {
		System.out.println("Total amount before discount is:"+total);
		discountAmount=total*discountAmount/100;
		total=total-discountAmount;
		System.out.println("Total amount of After discount ( $"+discountAmount+" ) is:"+total);
	}
	
	static void shop() {
		System.out.println("...Shopping System Initialized...");
	}
	
	public static void main(String[] args) {
		
		shop();
		ShoppingCart s1=new ShoppingCart();
		s1.itemName="Galaxy Phone";
		s1.price=5000;
		s1.quantity=2;
		s1.total=s1.quantity*s1.price;
		s1.discountAmount=10;
		
		s1.calculateTotal();
		s1.applyDiscount();
		
		System.out.println();
		
		shop();
		ShoppingCart s2=new ShoppingCart();
		s2.itemName="Iphone";
		s2.price=5000;
		s2.quantity=2;
		s2.total=s2.quantity*s2.price;
		s2.discountAmount=20;
		
		s2.calculateTotal();
		s2.applyDiscount();
		
	}

}
