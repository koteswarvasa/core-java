package com.logicalstatements;

import java.util.Scanner;

public class TestDemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age: ");
		int age = sc.nextInt();

		if (age > 18) {
			System.out.println("Congratulations");
			System.out.println("you are eligible for the voting!!...");
		}else {
			System.out.println("Bad Luck!!..");
			System.out.println("Unfortunatly you re not eligible!!...");
		}

		sc.close();
	}
}
