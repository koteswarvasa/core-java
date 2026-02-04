package com.tasks;

import java.util.Arrays;

public class Practice {
	public static void main(String[] args) {
		int[] nums1 = { 1,2 };
		int[] nums2 = { 3,4 };

		double k=findMedianSortedArrays(nums1, nums2);
		System.out.println(k);

	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int m = nums1.length;
		int n = nums2.length;
		int[] result = new int[m+n];
		int i = 0, j = 0, y = 0;

		while (i < m && j < n) {
			if (nums1[i] < nums2[j]) {
				result[y++] = nums1[i++];

			} else {
				result[y++] = nums2[j++];

			}
		}
		
		while(i<m) {
			result[y++] = nums1[i++];
		}
		
		while(j<n) {
			result[y++] = nums2[j++];
		}

		System.out.println("Merged Sorted Array: "+Arrays.toString(result));
		
		
		int x = m + n;
		if(x%2==1) {
			return result[x/2];
		}
		else {
		return (result[(x/2)-1] + result[x/2])/2.0;
		}
	}
}
