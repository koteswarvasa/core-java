package com.arrays.sorting;

import java.util.Arrays;

public class SelectionSort {
public static void main(String[] args) {
	
	int [] arr = {1,4,3,2,6,5};
	
	
	 for(int i=0;i<arr.length;i++) {
		 int min=i;
		 
		 for(int j=i+1;j<arr.length;j++) {
			 if(arr[j]<arr[min]) {
				 min=j;
			 }
		 }
		 
		 int temp=arr[i];
		 arr[i]=arr[min];
		 arr[min]=temp;
	 }
	
	Arrays.stream(arr).forEach(t->System.out.print(t+" "));
}
}
