package com.tasks.arrays;

public class Buy_Stock_And_Sell_Stock {
	
//	public static int maxProfit(int[] price) {
//		int profit  = 0;
//		int low = price[0];
//		
//		for(int i=1;i<price.length;i++) {
//			int temp = price[i]-low;
//			
//			if(price[i]<low) {
//				low = temp;
//			}
//			
//		}
//		
//		return profit;
//		
//	}
public static void main(String[] args) {
//	int[] arr = {1,8,4,3,2,6};
	int[] arr = {10,5,11,1,19,27,13};
	
	int max = 0;
	
	for(int i=0;i<arr.length-1;i++) {
		for(int j=i+1;j<arr.length;j++) {
			max= Math.max(max,arr[j]-arr[i]);
		}
	}
	
	System.out.println(max);
}
}
