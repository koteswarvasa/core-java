package com.tasks;

import java.util.Scanner;

public class DigitsCount {
	static Scanner sc = new Scanner(System.in);

	static int countDigits(int num) {

		int digits = String.valueOf(num).length();
		return digits;
	}

	public static void main(String[] args) {
		while (true) {
			System.out.println("Enter a Number: ");
			int num = sc.nextInt();
			if (num == 0) {
				System.out.println("Exit...");
				break;
			}

			System.out.println("digits in given number: " + countDigits(num));
		}
	}
}
