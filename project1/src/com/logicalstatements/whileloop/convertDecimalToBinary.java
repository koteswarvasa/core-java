package com.logicalstatements.whileloop;

import java.util.Scanner;

public class convertDecimalToBinary {
	static Scanner sc = new Scanner(System.in);

	static String decimalToBinary(int num) {
		int r = 0;
		String rstr = "";

		while (num != 0) {
			r = num % 2;
			num /= 2;
			rstr = r + " " + rstr;
		}
		return rstr;
	}

	public static void main(String[] args) {
		
		int decimal = 0b101;
		System.out.println(decimal);
		
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();

		String result = decimalToBinary(num);
		System.out.println("Coverting Decimal ("+num+") to Binary is : "+result );

	}
}
