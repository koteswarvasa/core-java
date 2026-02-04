package com.tasks.arrays;

//import java.util.Arrays;

public class FreqCout {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 1, 2 };

		boolean[] visit = new boolean[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			
			if(visit[i]) {
				continue;
			}
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					visit[j]=true;
				}
			}
			
			if(count==1) {
				System.out.print(arr[i]+" ");
			}
//			System.out.println(" Count Occurence of ["+arr[i]+"] in an given array -> "+count+" times");
		}
	}

}
