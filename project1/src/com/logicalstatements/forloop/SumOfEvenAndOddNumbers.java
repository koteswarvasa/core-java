package com.logicalstatements.forloop;

import java.util.Scanner;

public class SumOfEvenAndOddNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a range ");
		int n = sc.nextInt();
		
		int evenSum = 0;
		int oddSum = 0;
		
		for(int i=0;i<=n;i++) {
			if(i%2==0 && i!=0) {
				evenSum+=i;
			}
			else {
				oddSum+=i;
			}
		}
		
		System.out.println("Even Numbers Sum upto to "+n+" is: "+evenSum);
		System.out.println("Odd Numbers Sum upto to "+n+" is: "+oddSum);
		sc.close();
	}
}
