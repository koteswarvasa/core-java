package com.tasks.arrays;

public class TransposeMatrix {
public static void main(String[] args) {
	int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
	
	int rows=arr.length;
	int col=arr[0].length;
	
	System.out.println(rows);
	System.out.println(col);
	
	
	int[][] result= new int[col][rows]; 
	for(int i=0;i<rows;i++) {
		for(int j=0;j<col;j++) {
			result[j][i]=arr[i][j];
		}
	}
	
	System.out.println();
	for(int[] a:result) {
		for(int a1:a) {
			System.out.print(a1+" ");
		}
		System.out.println();
	}
}
}
