package com.tasks;

import java.util.Scanner;

public class DivisbleBy5And11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();

//	if(num%5==0 && num%11==0) 
//		System.out.println("Given Number is Divisble by 5 And 11");
//	else
//		System.out.println("Given Number Not Divisble by 5 And 11");

		if (num % 5 == 0)
			System.out.println("Given Number is Divisble by 5");
		else if (num % 11 == 0)
			System.out.println("Given Number Not Divisble by 11");

		sc.close();
	}
}
