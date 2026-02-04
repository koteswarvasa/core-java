package com.tasks.arrays;

//import java.util.LinkedHashSet;

public class Duplicates_Elements_From_Array {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 25, 5, 4, 6, 5, 4 ,1};
		
		System.out.print("Given Array: ");
		
		for (int i : arr) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		int size=0;
	
	
		for(int i=0;i<arr.length;i++) {
			boolean flag=false;
			for(int j=0;j<size;j++) {
				
				if(arr[i]==arr[j]) {
					flag=true;
					break;
				}
			}
			
			if(!flag) {
				System.out.print(arr[i]+" ");
				size++;
			}
			
			
		}
		
		
		
	}
}
