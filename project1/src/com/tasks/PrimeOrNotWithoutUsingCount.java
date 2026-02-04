package com.tasks;

import java.util.Scanner;

public class PrimeOrNotWithoutUsingCount {

//	public static void isPrime(int num) {
//		for(int i=2;i<=num/2;i++) {
//			if(num%i==0) {
//				System.out.print(i+" ");
//			}
//		}
//	}

	public static boolean isPrime(int num) {
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();

//		isPrime(num);

		if (isPrime(num)) {
			System.out.println("Given Number is Prime Number");
		} else {
			System.out.println("Given Number is not a Prime Number");
		}
		sc.close();
	}
}
