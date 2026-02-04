package com.logicalstatements.forloop;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialOfAGiveNumber {

	static BigInteger findFactorial(int num) {
		
		if (num == 0 || num == 1) {
			return BigInteger.ONE;
		}else {
			return BigInteger.valueOf(num).multiply(findFactorial(num-1));
		}
//		for (long i = 2; i <= num; i++) {
//		   fact =  fact.multiply(BigInteger.valueOf(i));
//		}
//		return fact;
	}

	public static void main(String[] args) {

		System.out.println("main method started!!!...");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		String s = sc.next();

		int num = Integer.parseInt(s);

		BigInteger result = findFactorial(num);

		System.out.println("Factorial of Given Number: " + result);
		sc.close();
		System.out.println("main method ended!!...");
	}
}
