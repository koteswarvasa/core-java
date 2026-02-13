package com.tasks.arrays;

public class MaxSubArray1 {
	public static void main(String[] args) {
		int[] arr = { 1, 0, 0, 1, 1, 0, 1 }; // 1 0 0 1 1 0

		int max = 0;
		int startIndex = 0;
		int endIndex = 0;

		for (int end = 0; end < arr.length; end++) {
			;
			int ones = 0;
			int zeros = 0;

			for (int j = end; j < arr.length; j++) {

				if (arr[j] == 0) {
					zeros++;
				} else {
					ones++;
				}

				if (ones == zeros) {
					if (j - end + 1 > max) {
						max = j - end + 1;
						startIndex = end;
						endIndex = j;
					}
				}

			}
		}

		System.out.println("Maximum Length: " + max);
		for (int i = startIndex; i <= endIndex; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
