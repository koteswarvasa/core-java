package com.arrays;

public class Transpose_matrix {
public static void main(String[] args) {
	
	
	int[][] arr = {{1,2,3},
			       {4,5,6},
			       {7,8,9}
	              
	             };
	
	int rows=arr.length;
	int cols=arr[0].length;
	
	int[][] result = new int[cols][rows];
	
	for(int i=0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
			//Transpose Matrix
//			result[j][i]=arr[i][j];
			//90 Anti-clock wise
//			result[rows-j-1][i]=arr[i][j];
			//90 clock wise
			result[j][rows-i-1]=arr[i][j];
			
//			result[rows-i-1][j]=arr[i][j];
		}
	}
	
	
	
	for (int[] is : result) {
		for(int is1:is) {
			System.out.print(is1+" ");
		}
		System.out.println();
	}
	
	
}
}
