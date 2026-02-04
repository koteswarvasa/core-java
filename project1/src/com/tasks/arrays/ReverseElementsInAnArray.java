package com.tasks.arrays;

import java.util.Arrays;

public class ReverseElementsInAnArray {

	static int reverse(int n) {
		int rev = 0;
		while (n != 0) {
			rev = rev * 10 + n % 10;
			n /= 10;
		}

		return rev;
	}

	public static void main(String[] args) {

		int[] arr = { 121, 551, 967, 123 };

		for (int a : arr) {
			System.out.print(reverse(a) + " ");
		}

	}
}
