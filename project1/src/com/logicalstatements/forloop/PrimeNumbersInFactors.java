package com.logicalstatements.forloop;

import java.util.Scanner;

public class PrimeNumbersInFactors {
	static Scanner sc = new Scanner(System.in);
	
	static boolean isPrime(int a){
		
		if(a==0 || a==1) {
			return false;
		}
		
		for(int i=2;i<=a/2;i++) {
			if(a%i==0)
			return false;
		}
		return true;
	}
	
	public static void primeNumbersInFactors(int num) {
		
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				if(isPrime(i)) {
					System.out.print(i+" ");
				}
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		
		primeNumbersInFactors(n);
	}
}
