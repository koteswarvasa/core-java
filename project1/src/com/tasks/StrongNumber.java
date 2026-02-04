package com.tasks;

import java.util.Scanner;

public class StrongNumber {
	static Scanner sc = new Scanner(System.in);
	
	
	static void strongNumber(int n) {
		int r=0;
		int sum=0;
		int temp=n;
		while(n!=0) {
			 r = n%10;
			sum+= factorial(r);
			n/=10;
		}
		
		if(sum==temp) {
			System.out.println("Given Number is Strong Number!..");
		}else {
			System.out.println("Given Number is Not a Strong Number!..");
		}
	}
	
	static int factorial(int r) {
		int fact=1;
		for(int i=1;i<=r;i++) {
			fact=fact*i;
		}
		return fact;
	}
public static void main(String[] args) {
	System.out.println("Enter a NUmber: ");
	int n = sc.nextInt();
	strongNumber(n);
}
}
