package com.tasks.arrays;

public class WaterStorageProblem {
	public static void main(String[] args) {
//	int[] arr = {1,8,5,7,9,8,10};
//				{0,1,2,3,4,5,6}

//	int maxl=0;
//	for(int i=0;i<arr.length;i++) {
//		int max=0;
//		for(int j=i+1;j<arr.length;j++) {
//			int currArea = j-i;
//			
//			if(arr[i]<arr[j]) {
//				max=arr[i]*currArea>max?arr[i]*currArea:max;
//			}else {
//				max=arr[j]*currArea>max?arr[j]*currArea:max;
//			}
//			
//		}
//		
//		if(max>maxl) {
//			maxl=max;
//		}
//		
//	}
//	
//	System.out.println(maxl);

//		int[] arr = { 1, 8, 5, 7, 9, 8, 10 };
		int[] arr = { 0,1,0,2,1,0,1,3,2,1,2,1};

		int left = 0, right = arr.length - 1;
		int max = 0;

		while (left < right) {
			int area = Math.min(arr[left], arr[right]) * (right - left);
			max = Math.max(max, area);

			if (arr[left] < arr[right]) {
				left++;
			} else {
				right--;
			}
		}
		System.out.println(max);
	}
}
