package com.langfundamentals.typeofmethods;

public class TestMDemo1 {
	
	//  no return type + no parameters
	
	//Instance Block
	{
		System.out.println("Instance Block Started!...");
	}
	
	//Instance method
	void display() {
		System.out.println("Instance method started!...");
	}
	
	static void show() {
		System.out.println("Static method started!....");
		TestMDemo1 td1 = new TestMDemo1();
		td1.display();
		
	}
	
 void main() {
	System.out.println("Main method Started!..");
	display();
	show();
}
}
