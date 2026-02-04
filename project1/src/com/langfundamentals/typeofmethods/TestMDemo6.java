package com.langfundamentals.typeofmethods;

import java.util.Scanner;

public class TestMDemo6 {

	/*
	 * with return type and no arguments 1.when we use these type of method, we have
	 * to use these return values in somewhere
	 */
	static Scanner sc = new Scanner(System.in);

	double empSalary() {
		System.out.println("Enter your Salary: ");
		float a = sc.nextFloat();
		return a;
	}

	double empBonus() {
		System.out.println("Enter your Bonus: ");
		float a = sc.nextFloat();
		return a;
	}

	void main() {
		System.out.println("main method Started!....");

		double eSalary = empSalary();
		System.out.println("Employee Salary: " + eSalary);

		double eBonus = empBonus();
		System.out.println("Employee Bonus: " + eBonus);

		double totalSalary = eSalary + eBonus;
		System.out.println("Employee Total Salary: " + totalSalary);

		System.out.println("Main method ended!.....");

	}
}
