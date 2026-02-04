package com.tasks;

public class Mobile {
	// Constructor Overloading

	String brand;
	double price;
	String color;

	Mobile() {
		System.out.println("No-args Constructor !...");
		brand = "unknown";
		price = 0.0;
		color = "unknown";
	}

	public Mobile(String brand, double price) {
		System.out.println("1-args Constructor!....");
		this.brand = brand;
		this.price = price;
	}

	public Mobile(String brand, double price, String color) {
		System.out.println("3-args Constructor!...");
		this.brand = brand;
		this.price = price;
		this.color = color;
	}

	public Mobile(double price, String color, String brand) {
		System.out.println("3-args Constructor!...");
		this.brand = brand;
		this.price = price;
		this.color = color;
	}

	public Mobile(String color, String brand, double price) {
		System.out.println("3-args Constructor!...");
		this.brand = brand;
		this.price = price;
		this.color = color;
	}

	void show() {
		System.out.println("**************************");
		System.out.println("Mobile Brand : " + brand);
		System.out.println("Mobile Price : " + price);
		System.out.println("Mobile color : " + color);
		System.out.println("**************************");
	}

	public static void main(String[] args) {
		System.out.println("main method started!!..");
		Mobile m1 = new Mobile();
		m1.show();
		System.out.println();

		Mobile m2 = new Mobile("Realme", 15000.0);
		m2.show();
		System.out.println();

		Mobile m3 = new Mobile("Vivo", 20000.0, "Black");
		m3.show();
	}
}
