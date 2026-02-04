package com.tasks;

import java.util.Scanner;

public class Calculator {
	static Scanner sc = new Scanner(System.in);

	int a;
	int b;

	int add(int a, int b) {
		return a + b;
	}

	int sub(int a, int b) {
		return b - a;
	}

	int mul(int a, int b) {
		return a * b;
	}

	double div(int a, int b) {
		return (double)b / a;
	}

	double mod(int a, int b) {
		return (double)b % a;
	}

	void main() {
		System.out.println("Enter a value: ");
		int a = sc.nextInt();
		System.out.println("Enter b value: ");
		int b = sc.nextInt();
		
		
		
		
		System.out.println("==========Display Arithimetic Operations========");
		System.out.println("Addition of two numbres : " + add(a, b));
		System.out.println("Subtraction of two numbres : " + sub(a, b));
		System.out.println("Multiplication of two numbres : " + mul(a, b));
		System.out.println("Division of two numbres : " + div(a, b));
		System.out.println("Modulus of two numbres : " + mod(a, b));

	}
}
