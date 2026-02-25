package com.tasks.arrays;

import java.util.Arrays;

public class MoveZerosEnd {
public static void main(String[] args) {
	
	int[] arr = {1,0,2,0,9,0,5,0};
	

//	Approch 1  :
//	---------------------------------------------
//	int index = 0;
//	
//	for(int i : arr) {
//		if(i!=0) {
//			arr[index++] = i;
//		}
//	}
//	
//	while(index<arr.length) {
//		arr[index++] = 0;
//	}
	
//	Approch 2:
//	----------------------------------------------
	
	int j=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=0) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j++;
		}
	}
	System.out.println(Arrays.toString(arr));
}
}
