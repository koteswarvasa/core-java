package com.collections.tasks;

import java.util.Arrays;

public class MoveZerostoFront {
public static void main(String[] args) {
	int[] arr = {1,5,0,0,4,0,3};
	
	int[] ans = new int[arr.length];
	int j = 0;
	for(int i:arr) {
		if(i==0) {
			ans[j++] = i;
		}
	}
	
	for(int i:arr) {
		if(i!=0) {
			ans[j++] = i;
		}
	}
	
	System.out.println(Arrays.toString(ans));
	
}
}
