package com.tasks;

import java.util.Scanner;

public class Pattern1 {
	static Scanner sc = new Scanner(System.in);

	// print1

//	Enter no of rows: 
//		5
//		*
//		**
//		***
//		****
//		*****
//		****
//		***
//		**
//		*

	static void print1(int n) {
		for (int i = 1; i <= 2 * n; i++) {
			int stars = i;
			if (i > n) {
				stars = 2 * n - i;
			}
			for (int j = 1; j <= stars; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// print2

//	Enter no of rows: 
//	6
//	     *
//	    ***
//	   *****
//	  *******
//	 *********
//	***********
//	 *********
//	  *******
//	   *****
//	    ***
//	     *

	static void print2(int n) {
		for (int i = 1; i <= n; i++) {

			// Spaces
			for (int j = 1; j < n - i + 1; j++) {
				System.out.print(" ");
			}

			// stars
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 2; i <= n; i++) {

			// spaces
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}

			// stars
			for (int j = 1; j <= 2 * n - (2 * i - 1); j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

	static void print3(int n) {
		for (int i = 1; i <= n; i++) {
			char ch = 'A';
			for (int j = 1; j <= i; j++) {
				System.out.print((char) (ch + j - 1) + " ");
			}
			System.out.println();
		}
	}

//	print4

//	Enter no of rows: 
//		5
//		* * * * * 
//		*       * 
//		*       * 
//		*       * 
//		* * * * * 

	static void print4(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if ((i == 1 || i == 5) || (j == 1 || j == n)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

//	print5:

//	Enter no of rows: 
//		5
//		*       * 
//		  *   *   
//		    *     
//		  *   *   
//		*       * 

	static void print5(int n) {
		if (n % 2 == 0) {
			System.out.println("Exit...");
			return;
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == j || i + j == n + 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	// print6

//	Enter no of rows: 
//		5
//		K A B C K 
//		D O E O F 
//		G H H I J 
//		K L L L M 
//		I N O P I 

	static void print6(int n) throws InterruptedException {
		char ch = 'A';
		String s = "KOHLI";
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == j || i + j == n + 1) {
					Thread.sleep(1000);
					System.err.print(s.charAt(i - 1) + " ");
				} else {
					Thread.sleep(1000);

					System.out.print((char) (ch++) + " ");
				}
			}
			System.out.println();
		}
	}
	
//       1
//      1 1  
//     1 2 1
//    1 3 3 1
//   1 4 6 4 1
	
	static void print7(int n) {
		for(int i=1;i<=n;i++) {
			int num=1;
			for(int j=1;j<=n-i;j++) {
			  System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++) {
				System.out.print(num+" ");
				num=num*(i-k)/(k);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) throws InterruptedException {
//		System.out.println("Enter no of Test Cases: ");
//		int t = sc.nextInt();

//		for (int i = 1; i <= t; i++) {
			System.out.println("Enter no of rows: ");
			int n = sc.nextInt();

			print7(n);
//		}

	}
}
