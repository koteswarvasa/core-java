package com.tasks.arrays;

import java.util.Arrays;

public class MoveZerosEnd {
public static void main(String[] args) {
	
	int[] arr = {1,0,2,0,9,0,5,0};
	
	int index=0;
	
	for(int i:arr) {
		if(i!=0) {
			arr[index++]=i;
		}
	}
	
	System.out.println(index);//4
	
	while(index<arr.length) {
		arr[index++]=0;
	}
	
	System.out.println(Arrays.toString(arr));
}
}
