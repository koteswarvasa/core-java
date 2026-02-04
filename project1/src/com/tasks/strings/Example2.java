package com.tasks.strings;

public class Example2 {
	public static void main(String[] args) {

		int[] arr = { 2, 5, 3, 7, 1, 4, 6 };

		int k=15;
		int left=0,sum=0;
		int maxLen=0,startIndex=-1;
		
		for(int right=0;right<arr.length;right++) {
			sum+=arr[right];
			
			while(sum>k) {
				sum-=arr[left];
				left++;
			}
			
			if(sum==k) {
				int len = right-left+1;
				if(len>maxLen) {
					maxLen=len;
					startIndex=left;
				}
			}
		}
		
		if(startIndex!=-1) {
			for(int i=startIndex;i<startIndex+maxLen;i++) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}
