package com.tasks.arrays;

import java.util.Arrays;

public class ArrarElementsAddAtEnd {
	
	public static int sumValue(int a) {
		int sum=0;
		while(a!=0) {
			int x=a%10;
			sum+=x;
			a/=10;
		}
		
		return sum;
	}
public static void main(String[] args) {
	int[] arr = {12,23,34,56,78};
	
	int[] result = new int[arr.length*2];
	
	for (int i=0;i<arr.length;i++) {
		result[i]=arr[i];
	}
	
	int index=0;
	for(int i=arr.length;i<result.length;i++) {
		
			result[i]=sumValue(arr[index++]);
	}
	
	System.out.println(Arrays.toString(result));
	
}
}
