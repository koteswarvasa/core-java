package com.arrays;

public class ReverseAndRotatedArray {

	static void reverse(int[] arr,int start,int end) {
		for (int i = 0; i < arr.length; i++) {
			while (start < end) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}
		}
	}

	static void rotated(int[] arr,int k) {
		int start = 0;
		int end = arr.length - 1;
		
		reverse(arr,start,end);
		reverse(arr,start,k-1);
		reverse(arr,k,end);
		
		
	}

	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		
		int k=3;
		rotated(arr,k);

		for (int i : arr) {
			System.out.print(i + " ");
		}
		
		
	}
}
