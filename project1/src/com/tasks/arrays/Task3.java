package com.tasks.arrays;

public class Task3 {
	
	static int square(int n) {
		return n*n;
	}
	
	static int doubleValue(int n) {
		return n+n;
	}
public static void main(String[] args) {
	int[] arr= {3,10,7,9};
	
	for(int i=0;i<arr.length;i++) {
		if(i%2==0) {
			System.out.print(square(arr[i])+" ");
		}else {
			System.out.print(doubleValue(arr[i])+" ");
		}
	}
}
}
