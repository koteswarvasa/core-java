package com.tasks.arrays;

public class Rotate90degress {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int row = arr.length;
		int col = arr[0].length;
		
		int[][] result = new int[col][row];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				result[j][row-i-1] = arr[i][j];
			}
		}
		
		for(int[] i : result) {
			for(int j:i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
