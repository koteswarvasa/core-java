package com.logicalstatements.whileloop;

import java.util.Scanner;

public class PrimeNumbersInRange {
	static Scanner sc = new Scanner(System.in);

	static boolean isPrime(int a) {
		if (a == 0 || a == 1) {
			return false;
		}

		for (int i = 2; i <= a / 2; i++) {
			if (a % i == 0) {
				return false;
			}
		}

		return true;
	}

	static void primeOrNot(int num) {
		for (int i = 0; i < num; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		while (true) {
			System.out.println("Enter a Number: ");
			int num = sc.nextInt();

			if (num < 0) {
				System.out.println("Exit....");
				break;
			}

			primeOrNot(num);
			System.out.println();
		}

	}
}
