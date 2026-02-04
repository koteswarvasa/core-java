package com.arrays.sorting;

public class BubbleSortAlogorithm {
	// checks the adjacent elements
	public static void main(String[] args) {
		int[] arr = { 1,2,3,4,5};

		System.out.println("****************************");
		System.out.println("Before sorting: ");
		for (int i : arr) {
			System.out.print(i + " ");
		}

		int count=0;
		for (int i = 0; i < arr.length; i++) {
			boolean flag=false;
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=true;
				}
			}
			count++;
			if(!flag) {
				break;
			}
		}
		System.out.println();
		System.out.println(count);

		System.out.println();
		System.out.println("****************************");
		System.out.println("After sorting: ");
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}
}
