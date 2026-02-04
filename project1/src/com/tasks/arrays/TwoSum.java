package com.tasks.arrays;

import java.util.Arrays;

public class TwoSum {
public static void main(String[] args) {
	
	int[] arr = {1,9,1,3,6,5,7};
	int target=11;
	System.out.println(Arrays.toString(Two(arr,target)));
}

public static int[] Two(int []arr,int target) {
	
	for(int i=0;i<arr.length-1;i++) {
		for(int j=i+1;j<arr.length;j++) {
			int sum=arr[i]+arr[j];
			if(sum==target){
				return new int[] {i,j};
			}
		}
	}
	return new int[] {};
}
}
