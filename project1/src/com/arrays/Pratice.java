package com.arrays;

import java.util.Arrays;

public class Pratice {
public static void main(String[] args) {
	
	
	System.out.println("main method stated");
	try {
	int[] arr = new int[2];
	
	
	arr[0]=1;
	arr[1]=2;
	
	arr[0]=3;
	System.out.println(Arrays.toString(arr));
	}
	catch(NegativeArraySizeException e) {
	System.out.println(e.toString());
	}
	
	System.out.println("main method ended!..");
	

}
}
