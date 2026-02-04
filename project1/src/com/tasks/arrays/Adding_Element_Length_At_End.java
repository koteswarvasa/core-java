package com.tasks.arrays;

import java.util.Arrays;

public class Adding_Element_Length_At_End {
	
	public static int count(int a) {
		int count=0;
		while(a!=0) {
			count++;
			a/=10;
		}
		
		return count;
	}

	static int[] arr = { 25, 2, 226, 1, 8, 46 };
	public static void addElementLength(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
//			int len = String.valueOf(arr[i]).length();
			int len = count(arr[i]);

			arr[i] = arr[i] * 10 + len;
		}
	}

	public static void main(String[] args) {

		addElementLength(arr);

		System.out.println(Arrays.toString(arr));
	}
}
