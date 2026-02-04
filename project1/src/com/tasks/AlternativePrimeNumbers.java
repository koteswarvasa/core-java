package com.tasks;

public class AlternativePrimeNumbers {
	public static boolean isPrime(int num) {
		if(num==0 || num==1) {
			return false;
		}
		
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
public static void main(String[] args) {
	int count=0;
	int count1=0;
	for(int i=0;i<100;i++) {
		if(isPrime(i)) {
			count1++;
			if(count1%2!=0) {
			System.out.print(i+" ");
			count++;
			}
		}
	}
	System.out.println();
	System.out.println(count);
}
}
