package com.arrays;

public class MaxSumSubArray {

	public static boolean reverse(int[] arr) {
		boolean boo = false;
		for (int i = 0; i < arr.length - 1; i++) {
			 boo = false;
			if (arr[i] >= arr[i + 1]) {
				boo =  true;
			}
		}
		return boo;
	}

	public static int reverseSum(int[] arr) {

		int sum = 0;
		if (reverse(arr)) {
			for (int i : arr) {
				sum += i;
			}
			return sum;
		} else {
			for (int i = 0; i < arr.length; i++) {

				int max = Integer.MIN_VALUE;

				for (int j = i; j < arr.length; j++) {
					max = Math.max(max, arr[j]);
					sum += max;
				}
			}
			return sum;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1,2,3,4};

		System.out.println(reverseSum(arr));
	}
}
