package com.tasks.oops.encapsulation;

import java.util.Scanner;

public class Student_fee_payment_System {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Student s = new Student(1, "koti", 35000.0);
		
		System.out.println("Enter amount to pay: ");
		double fee = sc.nextDouble();
		
		s.payFee(fee);
		
//		s.displayFeeStatus();
		
		System.out.println(s.toString());
	}
}
