package com.logicalstatements.forloop;

import java.util.Scanner;

public class EvenOrOddUsingIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number we want print n number of iterations: ");
		int n = sc.nextInt();

		System.out.println("Even Numbers");
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0 && i != 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("Odd Numbers");
		for (int i = 0; i < n; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
		}

		sc.close();
	}
}
