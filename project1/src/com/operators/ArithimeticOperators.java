package com.operators;

import java.util.Scanner;

public class ArithimeticOperators {
public static void main(String[] args) {
	
//	int a=20,b=30;
//	
//	System.out.println("Addition of Two Numbers: "+(a+b));
//	System.out.println("Subtraction of Two Numbers: "+(a-b));
//	System.out.println("MUltiplication of Two Numbers: "+a*b);
//	System.out.println("Division of Two Numbers: "+a/b);
//	System.out.println("Modulus of Two Numbers: "+a%b);
	
	
	System.out.println("main method staretd ");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a value : ");
	int a = sc.nextInt();// 100
	System.out.println("Enter b value : ");
	int b = sc.nextInt();// 10
	// BODMAS
	System.out.println("Addition :" + a + b);// 10010
	System.out.println("Addition :" + (a + b));// 110
	// The operator - is undefined for the argument type(s) String, int
//	System.out.println("Subtraction : " + a-b);//
	System.out.println("Subtraction : " + (a - b));// 90
	System.out.println("Multiplication : " + a * b);// 1000
	System.out.println("Division -> Quotient: " + a / b);// 10
	System.out.println("Modulus -> Reminder : " + a % b);// 0
	
	sc.close();
	
}
}
