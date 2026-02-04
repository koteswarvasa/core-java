package com.tasks;

import java.util.Scanner;

public class NumberIsPostiveOrNegative {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();

//		if (num >= 0)
//			System.out.println("Given number is Positive ! !");
//		else
//			System.out.println("Given number is Negative ! !");
		
		String result = num>=0?"Given Number is Positive":"Given Number is Negative";

		System.out.println(result);
		sc.close();

	}
}
