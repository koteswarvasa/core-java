package com.tasks.arrays;

import java.util.Arrays;

public class Rotate_Matrix_90Clockwise {

	public static void main(String[] args) {
	
	int[][] arr = { {1,2,3},
					{4,5,6},
					{7,8,9},
				  };
	
	
	
//	   int rows=arr.length;
//	   int cols = arr[0].length;
//	   
//	   int[][] result = new int[cols][rows];
	   
	int n= arr.length;
	
	   for(int i=0;i<n;i++) {
		   for(int j=i;j<n;j++) {
			   int temp = arr[j][i];
			   arr[j][i] = arr[i][j];
			   arr[i][j] = temp;
		   }
	   }
	   
	   System.out.println("Transpose Array: ");
	   for(int[] n1 : arr) {
		   for(int n2:n1) {
			   System.out.print(n2+" ");
		   }
		   System.out.println();
	   }
	   
//	   System.out.println("*********************************");
//	   System.out.println("90 clockwise");
//	   
//	   for(int i=0;i<n;i++) {
//		   int left=0,right=n-1;
//		   while(left<right) {
//			   int temp=arr[i][left];
//			   arr[i][left]=arr[i][right];
//			   arr[i][right]=temp;
//			    left++;
//			    right--;
//		   }
//	   }
//	   
//	   
//	   for(int[] n1 : arr) {
//		   for(int n2:n1) {
//			   System.out.print(n2+" ");
//		   }
//		   System.out.println();
//	   }
	   
	   System.out.println("*********************************");
	   System.out.println("90 Anti-clockwise");
	   
	   for(int i=0;i<n;i++) {
		   int left=0,right=n-1;
		   while(left<right) {
			   int temp=arr[left][i];
			   arr[left][i]=arr[right][i];
			   arr[right][i]=temp;
			    left++;
			    right--;
		   }
	   }
	   
	   
	   for(int[] n1 : arr) {
		   for(int n2:n1) {
			   System.out.print(n2+" ");
		   }
		   System.out.println();
	   }
}
}
