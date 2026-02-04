package com.logicalstatements.forloop;

import java.util.Scanner;

//for Example -12
//Factors are - sum(1,2,3,4,6) = 12
public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:  ");
		int n = sc.nextInt();

		int sum = 0;

		for (int i = 1; i <= (n / 2); i++) {
			if (n % i == 0) {
				sum += i;
			}

		}

		if (sum == n) {
			System.out.println("Given number is Perfect Number");
		} else {
			System.out.println("Given number is Not a Perfect Number");
		}

		sc.close();
	}
}
