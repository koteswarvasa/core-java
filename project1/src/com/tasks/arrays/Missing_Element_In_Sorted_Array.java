package com.tasks.arrays;

import java.util.Arrays;

public class Missing_Element_In_Sorted_Array {

	public static void main(String[] args) {

		int [] arr = {10,4,5,8};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				}
			}
		}
//		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		for(int i=1;i<arr.length;i++) {
			int diff=arr[i]-arr[i-1];
			if(diff>1) {
				for(int j=arr[i-1]+1;j<arr[i];j++) {
					System.out.print(j+" ");
				}
			}
		}

	}
}
