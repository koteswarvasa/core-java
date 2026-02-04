package com.tasks.arrays;

public class PrintPrimeNumberInAArray {
	
	public static boolean isPrime(int r) {
		return false;
	}
	
	public static void prime(int[][] arr) {
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr.length;j++) {
				int r = i+j;
				
				if(isPrime(r)) {
					arr[i][j] = r;
				}
			}
		}
	}
public static void main(String[] args) {
	int[][] arr = {{1,0,0},{0,1,0},{0,0,1}};
	
	prime(arr);
	
	for(int[] i:arr) {
		for(int j:i) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
}
}
