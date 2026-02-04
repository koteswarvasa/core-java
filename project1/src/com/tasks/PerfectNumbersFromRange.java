package com.tasks;

import java.util.Scanner;

public class PerfectNumbersFromRange {
	
	static boolean isPerfect(int num) {
		int sum=0;
		for(int i=1;i<=(num/2);i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		
		if(sum==num) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a Number: ");
//		int num = sc.nextInt();
		
		for(int i=1;i<=1000;i++) {
		if(isPerfect(i)) {
			System.out.println(i+" is a Perfect Number...");
		}
		}
		sc.close();
	}
}
