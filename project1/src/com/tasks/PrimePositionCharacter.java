package com.tasks;

public class PrimePositionCharacter {
	
	static boolean isPrime(int n) {
		
		if(n==0 || n==1) {
			return false;
		}
		
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		
		return true;
	}
public static void main(String[] args) {
	for(int i=1;i<=26;i++) {
		if(isPrime(i)) {
			System.out.println((char)('A'+i-1)+" = "+i);
		}
		
	}
}
}
