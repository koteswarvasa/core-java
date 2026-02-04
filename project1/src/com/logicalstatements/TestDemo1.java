package com.logicalstatements;

import java.util.Scanner;

public class TestDemo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter status: ");
		boolean statusCheck=sc.nextBoolean();
		
//		if(statusCheck) 
//			System.out.println("eligible");
//		    System.out.println("Congratulations");
//		    else   //Syntax error on token "else", delete this token
//		    	 System.out.println("Not eligible");
//		         System.out.println("Bad Luck");
		
//		the above code is error because,
//		 we can write the "else" end of the line "if" block
		
//		note: 
//			1."if" block we write the statements without braces 
//			   it take the one statement as if block remaining execute
		
		
		if(statusCheck) 
			System.out.println("eligible");
		    else   //Syntax error on token "else", delete this token
		    	 System.out.println("Not eligible");
		         System.out.println("Bad Luck");
		sc.close();
	}
}
