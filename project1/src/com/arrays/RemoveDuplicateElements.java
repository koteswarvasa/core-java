package com.arrays;

import java.util.Arrays;

public class RemoveDuplicateElements {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 2, 1, 3, 4, 6, 7 };

		Arrays.sort(arr);

		System.out.print(arr[0]);
		for(int i=1;i<arr.length;i++) {
			if(arr[i]!=arr[i-1]) {
				System.out.print(" "+arr[i]);
			}
		}
	}
}
