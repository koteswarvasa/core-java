package com.tasks.arrays;


import java.util.Arrays;

public class RotatedArrayByKSteps {
	public static void main(String[] args) {
		System.out.println("main method started");

		int arr[] = { 1, 2, 3, 4, 5 };

		int shifts =2%(arr.length);
		
		int[] ans = new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			if(i<shifts) {
				ans[i]=arr[arr.length+i-shifts];
			}else {
				ans[i]=arr[i-shifts];
			}
		}
		
		System.out.println(Arrays.toString(ans));
	}
}

