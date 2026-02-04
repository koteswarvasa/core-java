package com.exception_handling_customException;

import java.util.Scanner;

public class TestDemo15 {
public static void main(String[] args) throws KotiException {
	System.out.println("main method started");
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter your age: ");
	
	int age = sc.nextInt();
	
	if(age<18) {
		throw new KotiException("your not eligible !!");
	}else {
		System.out.println("you are eligible for voting or driving");
	}
}
}
