package com.tasks.arrays;

import java.util.Arrays;

public class ProductElementsInArray_WithoutItSelf {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };

		int[] result = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr.length; j++) {
				if (!(arr[i] == arr[j])) {
					sum += arr[j];
				}
			}
			result[i] = sum;
		}
		
		System.out.println(Arrays.toString(result));
	}
}
