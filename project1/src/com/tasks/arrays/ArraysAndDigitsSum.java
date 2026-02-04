package com.tasks.arrays;

public class ArraysAndDigitsSum {
	public static int digitSum(int a) {
		int sum = 0;
		while (a != 0) {
			int b = a % 10;
			sum += b;
			a /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] arr = { 123, 143, 157, 193, 117, 12345 };

		for (int i = 0; i < arr.length; i++) {

			int sum = digitSum(arr[i]);

			int digits = String.valueOf(sum).length();

			int value = (int) Math.pow(10, digits);

			arr[i] = (arr[i] * value) + sum;
		}

		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
