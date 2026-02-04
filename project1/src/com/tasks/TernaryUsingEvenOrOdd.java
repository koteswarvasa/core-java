package com.tasks;

import java.util.Scanner;

public class TernaryUsingEvenOrOdd {
//	1) Write a Java program using the ternary operator to check
//      if a number is even or odd without 
//	     using the modulus operator (%).

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int a=sc.nextInt();
		
		String msg = (a&1)==0?"even":"Odd";
		System.out.println("Given Number is : "+msg);
		
		sc.close();
		
		
	}
}
