package com.tasks.arrays;

import java.util.Arrays;

public class Example {
public static void main(String[] args) {
	  int[] arr = {1, 5, 3, 2, 4, 6};
      int k = 5;
      
      int currSum=0;
      int start=0;
      
      for(int end =0;end<arr.length;end++) {
    	  currSum+=arr[end];
    	  
    	  while(currSum>k && start<=end) {
    		  currSum-=arr[start];
    		  start++;
    	  }
    	  
    	  if(currSum==k && (end-start+1)>1) {
    		  for(int  i=start;i<=end;i++) {
    			  System.out.print(arr[i]+" ");
    		  }
    	  }
      }
      
}
}
