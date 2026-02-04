package com.logicalstatements.whileloop;

import java.util.Scanner;

public class PrimeOrNot {
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

	public static void main(String[] args) {

		int num;

		while (true) {
			System.out.println("Enter a Number: ");
			num = sc.nextInt();

			if (num < 0) {
				System.out.println("Exits....");
				break;
			}
			if (isPrime(num)) {
				System.out.println("Give Number is Prime");
			} else {
				System.out.println("Give Number is not Prime");
			}
		}
	}
}
