package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementstoArrayStringValues {
	static Scanner sc = new Scanner(System.in);
public static void main(String[] args) {
	
	System.out.println("Enter a String Elements: ");
//	String s = sc.nextLine();
//	
//	String[] s1 = s.split(" ");
	String[] arr = new String[5]; 
	
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.next();
	}
	
	System.out.println(Arrays.toString(arr));
}
}
