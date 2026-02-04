package com.tasks;

public class NthPrimeNumber {
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
		count1++;
		if(isPrime(i)) {
			if(count1%2!=0) {
			System.out.print(i+" ");
			count++;
			}	
		}
		if(count1==5) {
			System.out.println(i);
			break;
		}
	}
	
	System.out.println();
	System.out.println(count);
}
}
