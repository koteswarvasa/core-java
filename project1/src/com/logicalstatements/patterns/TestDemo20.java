package com.logicalstatements.patterns;

import java.util.Scanner;

public class TestDemo20 {
	static Scanner sc = new Scanner(System.in);

	// print20
//	Enter rows
//	5
//	F
//	EF
//	DEF
//	CDEF
//	BCDEF
	static void print20(int n) {
		for (int i = 1; i <= n; i++) {
			for (char ch = (char) ('F' - i + 1); ch <= 'F'; ch++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}

	// print21

//	Enter rows
//	3
//	******
//	**  **
//	*    *
//	*    *
//	**  **
//	******

	static void print21(int n) {

		// upper
		for (int i = 1; i <= n; i++) {
			// stars
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print("*");
			}

			for (int j = 1; j <= 2 * i - 2; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// lower
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			for (int j = 1; j <= 2 * (n - i); j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// print22

//	Enter rows
//	5
//	*        *
//	**      **
//	***    ***
//	****  ****
//	**********
//	****  ****
//	***    ***
//	**      **
//	*        *

	static void print22(int n) {

		int spaces = 2 * n - 2;
		for (int i = 1; i < 2 * n; i++) {
			int stars = i;
			if (i > n) {
				stars = 2 * n - i;
			}

			// stars
			for (int j = 1; j <= stars; j++) {
				System.out.print("*");
			}

			// spaces
			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}

			// stars
			for (int j = 1; j <= stars; j++) {
				System.out.print("*");
			}

			if (i < n) {
				spaces -= 2;
			} else {
				spaces += 2;
			}
			System.out.println();
		}
	}

	// print23

//	Enter rows
//	5
//	*****
//	*   *
//	*   *
//	*   *
//	*****

	static void print23(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || j == 1 || j == n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	//print24() 
	
//	Enter rows
//	4
//	4444444
//	4333334
//	4322234
//	4321234
//	4322234
//	4333334
//	4444444
	
	static void print24(int n) {
		for (int i = 1; i <= 2 * n - 1; i++) {
			for (int j = 1; j <= 2 * n - 1; j++) {

				int top = i - 1;
				int left = j - 1;
				int right = (2 * n - 1) - j;
				int down = (2 * n - 1) - i;

				System.out.print(n - Math.min(Math.min(top, down), Math.min(left, right)));
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter number of test cases: ");
		int t = sc.nextInt();

		for (int i = 1; i <= t; i++) {
			System.out.println("Enter rows");
			int n = sc.nextInt();
			print24(n);
		}
	}
}
