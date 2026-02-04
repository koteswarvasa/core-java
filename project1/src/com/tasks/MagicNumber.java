package com.tasks;

import java.util.Scanner;

public class MagicNumber {
	public static boolean magicNumber(int n) {

		int temp = n;
		int r = 0;
		while (n > 9) {
			
			int sum = 0;
			int pro = 1;
			
			while (n != 0) {
				r = n % 10;
				n /= 10;
				sum += r;
				pro *= r;
			}

			n = sum;
			temp = pro;
		}

		if (temp == n) {
			return true;
		}
		return false;
		
		
//		int r=0;
//		while(n>9) {
//			int sum=0;
//		while(n!=0) {
//			r=n%10;
//			sum+=r;
//			n/=10;
//			
//		}
//		n=sum;
//		}
//		
//		if(n==1) {
//			return true;
//		}
//		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();

		if (magicNumber(n)) {
			System.out.println("Given number is magic Number");
		} else {
			System.out.println("Given number is not magic Number");
		}

		sc.close();
	}
}
