package com.constructors.notes;

public class Customer {
	int id;
	String name;
	long phone;
	int age;

	Customer() {
		//this(1);
		System.out.println("no - args Constructor");
	}

	Customer(int id) {
		//this(id, "abcd");
		System.out.println("1 - args Constructor");
		//this(id, "abcd");
	}

	Customer(int id, String name) {
		this(id, "abcd", 845697909979L);
		System.out.println("1 - args Constructor");
	}

	Customer(int id, String name, long phone) {
		this(id, name, phone, 21);
		System.out.println("2 - args Constructor");
	}

	Customer(int id, String name, long phone, int age) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.age = age;
		System.out.println("3 - args Constructor");
	}

	void show() {
		System.out.println("***********************************");
		System.out.println("Customer Id: " + id);
		System.out.println("Customer Name: " + name);
		System.out.println("Customer Phone Number: " + phone);
		System.out.println("Customer Age: " + age);
	}

	public static void main(String[] args) {
		Customer c = new Customer();
		c.show();

	}
}
