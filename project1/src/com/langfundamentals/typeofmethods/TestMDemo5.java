package com.langfundamentals.typeofmethods;

import java.util.Scanner;

public class TestMDemo5 {

	// with return type and no arguments
	// it return some value and we cannot pass any arguments

	static Scanner sc = new Scanner(System.in);

	int add() {
		System.out.println("Enter a value: ");
		int a = sc.nextInt();
		System.out.println("Enter b value: ");
		int b = sc.nextInt();

		return (a + b);
	}

	int sub() {
		System.out.println("Enter a value: ");
		int a = sc.nextInt();
		System.out.println("Enter b value: ");
		int b = sc.nextInt();

		return (a - b);
	}

	int mul() {
		System.out.println("Enter a value: ");
		int a = sc.nextInt();
		System.out.println("Enter b value: ");
		int b = sc.nextInt();

		return a * b;
	}

	float div() {
		System.out.println("Enter a value: ");
		int a = sc.nextInt();
		System.out.println("Enter b value: ");
		int b = sc.nextInt();

		return a / b;
	}

	double mod() {
		System.out.println("Enter a value: ");
		int a = sc.nextInt();
		System.out.println("Enter b value: ");
		int b = sc.nextInt();

		return a % b;
	}

	String display() {
		System.out.println("Enter a String: ");
		String s = sc.nextLine();

		return s;
	}

	char show() {
		System.out.println("Enter a Character value: ");
		char c = sc.next().charAt(0);

		return c;
	}

	boolean check() {
		System.out.println("Enter a Boolean Value: ");
		boolean b = sc.nextBoolean();

		return b;
	}

	void main() {
		System.out.println("main method started");

//		int addition = add();
//		System.out.println("Addition of two numbers: " + addition);
//		System.out.println();
//
//		int subtraction = sub();
//		System.out.println("subtraction of two numbers: " + subtraction);
//		System.out.println();
//
//		int multiplication = mul();
//		System.out.println("multiplication of two numbers: " + multiplication);
//		System.out.println();
//
//		float division = div();
//		System.out.println("division of two numbers: " + division);
//		System.out.println();
//
//		double modulus = mod();
//		System.out.println("modulus of two numbers: " + modulus);
//		System.out.println();

//		String s1=display();
//		System.out.println("display the string: "+s1);
//		System.out.println();
//

//		char character = show();
//		System.out.println("Character : " + character);
//		System.out.println();

//		boolean b = check();
//		System.out.println("Boolean value: " + b);
//		System.out.println();
		

//		System.out.println("main method ended");
	}
}
