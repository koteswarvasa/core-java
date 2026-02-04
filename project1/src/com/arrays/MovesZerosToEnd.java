package com.arrays;

import java.util.Arrays;

public class MovesZerosToEnd {
public static void main(String[] args) {
	try {
	int[] arr = {1,0,0,3,4,0,2};
	
//	int[] result = new int[arr.length];
	
	int index=0;
	
	for(int a:arr) {
		if(a!=0) {
			arr[index++]=a;
		}
	}
	
	System.out.println(index);
	while(index<arr.length) {
		arr[index++]=0;
	}
	
	System.out.println(index);
	System.out.println(Arrays.toString(arr));
	}
	catch(Exception e){
		System.out.println(e.toString());
	}
	
	System.out.println("main method ended");
		
	
}
}
