package com.tasks.casestudy;

import java.util.Scanner;

public class Patterns {
	static Scanner sc = new Scanner(System.in);

	
	//print1(n)
	
//	Enter a Number: 
//		5
//		    1
//		   123
//		  12345
//		 1234567
//		123456789
//		 1234567
//		  12345
//		   123
//		    1
		    
	static void print1(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}

			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		for (int i = 2; i <= n; i++) {
			for (int j = 2; j <= i; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= 2 * n - (2 * i - 1); j++) {
				System.out.print(j);
			}
			
			System.out.println();
		}
	}
	
	
	//print2
	
//	Enter a Number: 
//	4
//		1 2 3 4 
//		 2 3 4 
//		  3 4 
//		   4 
//		  3 4 
//		 2 3 4 
//		1 2 3 4 
	
	
	static void print2(int n) {
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=i-1;j++) {
				System.out.print(" ");
			}
			
			
			int a=i;
			for(int j=n;j>=i;j--) {
				System.out.print(a++ +" ");
			}
			
			System.out.println();
		}
		
		for(int i=2;i<=n;i++) {
			
			
			for(int j=n-1;j>=i;j--) {
				System.out.print(" ");
			}
			
			int a=n-(i-1);
			for(int j=1;j<=i;j++) {
				System.out.print(a++ +" ");
			}
			System.out.println();
		}
	}
	
	
	

	public static void main(String[] args) {

		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		print2(n);
	}

}
