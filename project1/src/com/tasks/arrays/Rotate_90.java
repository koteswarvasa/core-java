package com.tasks.arrays;

public class Rotate_90 {
public static void main(String[] args) {
	
	int[][] arr = { {1,2,3},
			        {4,5,6},
	                {7,8,9}
		  };
	
	int rows=arr.length;
	int cols=arr[0].length;
	
	int[][] ans = new int[cols][rows];
	
	for(int i=0;i<rows;i++) {
		int k=2;
		for(int j=0;j<cols;j++) {
//			ans[j][rows-i-1]=arr[i][j];
//			ans[cols-j-1][i]=arr[i][j];
//			ans[rows-i-1][k--]=arr[i][j];
			ans[j][i]=arr[i][j];
		}
	}
   for (int[] is : ans) {
	for(int is1:is) {
		System.out.print(is1+" ");
	}
	System.out.println();
}
	
}
}
