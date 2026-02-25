package com.collections.tasks;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindPivotIndex {
	public static int index(int[] arr) {

//		Approch 1
//		int totalSum=0;
//		
//		for(int n:arr) {
//			totalSum+=n;
//		}
//		
//		int leftSum=0;
//		
//		for(int i=1;i<arr.length;i++) {
//			int rightSum=totalSum-leftSum-arr[i];
//			
//			if(leftSum==rightSum) {
//				return i;
//			}
//			
//			leftSum+=arr[i];
//		}

		for (int i = 0; i < arr.length; i++) {
			
			int sum = 0;
			int sum1 = 0;
			int x = i;
			int x1 = i;

			while (x >= 0) {
				sum += arr[x];
				x--;
			}

			while (x1 < arr.length) {
				sum1 += arr[x1];
				x1++;
			}

			if (sum == sum1) {
				return i;
			}

		}
		return -1;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 7, 3, 6, 5, 6 };
//		int[] arr = {1,7,2,6};

		System.out.println(index(arr));
	}
}
