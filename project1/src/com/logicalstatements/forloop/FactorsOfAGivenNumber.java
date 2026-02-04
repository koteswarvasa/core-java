package com.logicalstatements.forloop;

import java.util.Scanner;

public class FactorsOfAGivenNumber {

	// for Example -12
//	    Factors are - 1,2,3,4,6,12

	static void factorsOfANumber(int num) {
		for (int i = 1; i <= num / 2; i++) {
			if(num%i==0) {
				System.out.print(i + " ");
			}
		}
		System.out.println(num);
	}

	public static void main(String[] args) {
		System.out.println("main method started!..");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:  ");
		String s = sc.next();

		int num = Integer.parseInt(s);

		factorsOfANumber(num);

		sc.close();
		System.out.println("main method ended!..");
	}
}
