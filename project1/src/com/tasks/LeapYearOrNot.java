package com.tasks;

import java.util.Scanner;

public class LeapYearOrNot {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter year: ");
	int year=sc.nextInt();
	
	if(year%4==0 || (year%100!=0 && year%400==0)) {
		System.out.println("Given year is Leap year: "+year);
	}else {
		System.out.println("Given year is not Leap year: "+year);
	}
	
	sc.close();
}
}
