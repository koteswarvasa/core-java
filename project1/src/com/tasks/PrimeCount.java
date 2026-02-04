package com.tasks;

import java.util.Scanner;

public class PrimeCount {
	static Scanner sc = new Scanner(System.in);
	
	static boolean isPrime(int n) {
		if(n==0 || n==1) {
			return false;
		}
		
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static int countPrime(int n) {
		int count=0;
		for(int i=0;i<=n;i++) {
			if(isPrime(i))
			 count++;
		}
		return count;
	}
public static void main(String[] args) {
	System.out.println("Enter a Number: ");
	int n= sc.nextInt();
	
	if(isPrime(n)) {
		System.out.println("Given number is prime!....");
		System.out.println("Position of "+n+" in prime numbers is :"+countPrime(n));
	}else {
		System.out.println("Not a prime Number!....");
	}
	
}
}
