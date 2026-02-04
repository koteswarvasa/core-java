package com.arrays;

import java.util.Scanner;

public class TwoDimentionalArray {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		//takes input from user
		System.out.println("Enter a array elements: ");
		String[] s = sc.nextLine().trim().split(" ");
		int k=0;
		
		
		//creating array
		int[][] arr = new int[3][2];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(s[k++]);
			}
		}
		
		//representing an array

		for (int i =0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
