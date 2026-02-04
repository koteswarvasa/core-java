package com.tasks.arrays;

public class LeadersOfAnArray {
public static void main(String[] args) {
	
	int[] arr = {16,17,4,3,5,2};
	
	int maxL=0;
	
	for(int i=arr.length-1;i>=0;i--) {
		if(arr[i]>maxL) {
			
			System.out.println(arr[i]);
			maxL=arr[i];
		}
	}
	
	
//	for(int i=0;i<arr.length;i++) {
//		boolean b=true;
//		for(int j=i+1;j<arr.length;j++) {
//			if(arr[i]<arr[j]) {
//				b=false;
//				break;
//			}
//		}
//		if(b) {
//			System.out.println(arr[i]);
//		}
//	}
}
}
