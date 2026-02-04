package com.tasks.arrays;

import java.util.Scanner;

public class Task2 {

	static Scanner sc = new Scanner(System.in);

	static int countEqual2(int n,int target) {
		int count = 0;
		while (n != 0) {
			int r = n % 10;
			n /= 10;
			if (r == target) {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		int[] arr = { 122, 222, 312, 412 };
		int sum = 0;

		System.out.println("Enter a target number: ");
		int target = sc.nextInt();
		for (int a : arr) {
			sum += countEqual2(a,target);
		}

		System.out.println("Occurences of "+target+" present in the given elements in array: " + sum);
	}
}
