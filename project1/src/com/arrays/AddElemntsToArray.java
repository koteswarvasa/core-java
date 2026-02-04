package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AddElemntsToArray {
	static Scanner sc = new Scanner(System.in);
public static void main(String[] args) {
	
	System.out.println("Enter a elements: ");
	String s = sc.nextLine();
	
	String[] s1 = s.split(" ");
	int[] arr = new int[s1.length];
	
	for(int i=0;i<arr.length;i++) {
		arr[i]=Integer.parseInt(s1[i]);
	}
	
	System.out.println("elements in the given array: ");
	for(int a:arr) {
		System.out.print(a+" ");
	}
	System.out.println();
	
	System.out.println("Prints Even index positions: ");
	for(int i=0;i<=arr.length;i++) {
		if(i%2==0) {
			System.out.print(arr[i]+" ");
		}
	}
	
	System.out.println();
	//reverse a Arrays
	System.out.println("Prints the reverse the array elements: ");
	for(int i=arr.length-1;i>=0;i--) {
		System.out.print(arr[i]+" ");
	}
	
	System.out.println();
	
	System.out.println("Prints the elements in the array format: ");
	System.out.println(Arrays.toString(arr));
	
	int max=arr[0];
	int min=arr[0];
	for(int a: arr) {
		if(max<a) {
			max=a;
		}
		if(min>a) {
			min=a;
		}
	}
	
	System.out.println(max);
	System.out.println(min);
	
	
}
}
