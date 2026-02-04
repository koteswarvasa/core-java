package com.tasks.arrays;

import java.util.Arrays;

public class Add_Last_Value {
	
	public static void add_LastToFirst(int[] arr) {
		
		for (int i=0;i<arr.length;i++) {
			int l = String.valueOf(arr[i]).length();
			arr[i] =(int) ((arr[i]%10) * (Math.pow(10, l-1))+ arr[i]/10);
		}
	}
public static void main(String[] args) {
	int[] arr = {123,456,765,987,7643};
	
	add_LastToFirst(arr);
	
	System.out.println(Arrays.toString(arr));
	
	
}
}
