package com.tasks.arrays;

import java.util.Arrays;

public class MaxSubArray {
public static void main(String[] args) {
	  int[] arr = {1, 5, 3, 2, 1,6};
      int k = 5;

      int start = 0;
      int currentSum = 0;

      for (int end = 0; end < arr.length; end++) {

          currentSum += arr[end];

          while (currentSum > k && start <= end) {
              currentSum -= arr[start];
              start++;
          }

          // length > 1 condition added
          if (currentSum == k && (end - start + 1) > 1) {
              System.out.println(
                  Arrays.toString(Arrays.copyOfRange(arr, start, end + 1))
              );
              return;
          }


}
}
}

