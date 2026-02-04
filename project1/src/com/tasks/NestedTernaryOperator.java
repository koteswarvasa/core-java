package com.tasks;

import java.util.Scanner;

public class NestedTernaryOperator {
//	2)Write a Java program to calculate and 
//		display the grade of a student using nested 
//	    ternary operators based on marks as shown below:

//		Marks Range	       Grade
//		≥90	                     A
//		80–89	                 B
//		70–79	                 C
//		60–69	                 D
//		<60	                     F
//
//		Challenge:
//		Also display “Pass” or “Fail” using another 
//	     ternary operator in the same statement.
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks: ");
		int marks = sc.nextInt();

		String grade = (marks >= 90 && marks <= 100) ? "A"
				: (marks >= 80 && marks < 90) ? "B"
				: (marks >= 70 && marks < 80) ? "C"
				: (marks >= 60 && marks < 70) ? "D" :(marks>0 && marks<60)? "F":"Invalid marks";

		String result = (marks < 60) ? 
				("Grade: " + grade + " (Fail)") : 
				("Grade: " + grade + " (Pass)");

		System.out.println(result);

		sc.close();
	}
}
