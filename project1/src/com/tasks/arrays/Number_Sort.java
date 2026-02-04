package com.tasks.arrays;

public class Number_Sort {
	
//	public static void valueArray(int[] arr,int num) {
//		int i=0;
//		while(num!=0) {
//			arr[i++]=num%10;
//			num/=10;
//		}
//	}
//	
//	public static void sort(int[] arr) {
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr.length-1;j++){
//				if(arr[j]>arr[j+1]) {
//					int temp = arr[j+1];
//					arr[j+1] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
//	}
	
	
public static void main(String[] args) {
	int num = 56321598;
//	int[] arr = new int[String.valueOf(num).length()];
	
//	valueArray(arr,num);
//	sort(arr);
//	
//	for (int i : arr) {
//		System.out.print(i);
//	}
	

	for(int i=0;i<=9;i++) {
		int temp = num;
		
		while(temp>0) {
			int rem = temp%10;
			if(rem==i) {
				System.out.print(rem);
			}
			temp/=10;
		}
	}
	
}
}
