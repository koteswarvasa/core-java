package com.tasks.arrays;

import java.util.Arrays;

public class SortArrayWithTwoSortedArrays {
public static void main(String[] args) {
	int[] a = {1,3,5};
	int[] b= {2,4,6};
	
	int[] c = new int[a.length+b.length];
	
	int index=0;
	for(int i=0;i<a.length;i++) {
		c[index++] = a[i];
		c[index++] = b[i];
	}
	
	System.out.println(Arrays.toString(c));
}
}
