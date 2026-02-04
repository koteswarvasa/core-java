package com.arrays;

public class MinAndMaxValuesInArray {
	public static void main(String[] args) {
//		int[] a = { 1, 2, 3, 4,60, -2, 90, -80 };
		int[] a= {1,1};
		
		int min = a[0];
		int max = a[0];
		int sec=0;
		
		for(int a1: a) {
			if(max < a1) {
				sec=max;
				max=a1;
			}else if(min>a1) {
				min=a1;
			}
		}
		
		System.out.println("Maximum value in an Array: "+max);
		System.out.println("Second highest value i an Array: :"+sec);
		System.out.println("Maximum value in an Array: "+min);
		

	}
}
