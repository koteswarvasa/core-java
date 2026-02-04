package com.tasks;

import java.util.Scanner;

public class OperatonsOnArthimethicUsingSwitchCase {
	static Scanner sc = new Scanner(System.in);
	
public static void main(String[] args) {
    System.out.println("Enter a number: ");
    int a = sc.nextInt();
    System.out.println("Enter b Number: ");
    int b=sc.nextInt();
    
    while(true) {
    System.out.println("======= Arthimetic Operations =======");
    System.out.println("1.Addition");
    System.out.println("2.Subtraction");
    System.out.println("3.Multiplication");
    System.out.println("4.Division");
    System.out.println("5.Modulus");
    
    System.out.println("Enter your choice: ");
    int choice=sc.nextInt();
    
    if(choice==-1) {
    	System.out.println("Existing...");
    	break;
    }
    
    switch(choice) {
    case 1-> System.out.println("Addition of Two Numbers: "+(a+b));
    case 2-> System.out.println("Subtraction of Two Numbers: "+(a-b));
    case 3-> System.out.println("Multiplication of Two Numbers: "+a*b);
    case 4-> System.out.println("Division of Two Numbers: "+a/b);
    case 5-> System.out.println("Modulus of Two Numbers: "+a%b);
    default -> System.out.println("Invalid choice!...");
    }
    }
	//sc.close();
	
}
}
