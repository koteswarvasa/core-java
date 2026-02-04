package com.tasks;

//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Map;
import java.util.Scanner;

// Description
// string length=9
//9 below Invalid Input
//abcdefghi

// three parts
//1.abc=1b3

//2.def =fed

//3.ghi=hij;

//output: 3+1+2;

public class Pratice {
	static Scanner sc = new Scanner(System.in);

	
	//condition part1
	static String conditionPart1(String part1) {
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < part1.length(); i++) {
			char ch = part1.charAt(i);

			if (Character.isLetter(ch)) {
				int position = Character.toLowerCase(ch) - 'a' + 1;

				if (i % 2 == 0) {
					result.append(position);
				} else {
					result.append(ch);
				}
			} else {
				result.append(ch);
			}
		}
		return result.toString();
	}
	
	
	//condition part2
	static String conditionPart2(String part2) {
		StringBuilder sb = new StringBuilder(part2);
		sb.reverse();
		return sb.toString();
	}
	
	
	//condition part3
	static String conditionPart3(String part3) {
		String incre = "";
		char[] ch = part3.toCharArray();
		for (char c : ch) {
			incre += (char) (c + 1);
		}
		return incre;
	}
	
	
	public static void main(String[] args) {

		System.out.println("Enter string: ");
		String s = sc.nextLine();
		System.out.println();

		System.out.println("**************************");
		System.out.println("Given String divides 3 Parts: ");
		if (s.length() < 9) {
			System.out.println("Invalid Input");
		} else if (s.length() == 9) {
			String part1 = s.substring(0, 3);
			String part2 = s.substring(3, 6);
			String part3 = s.substring(6, 9);

			System.out.println("part1 substring in String: " + part1);
			System.out.println("part2 substring in String: " + part2);
			System.out.println("part3 substring in String: " + part3);
			

			// condition
			System.out.println("****************************");
            String result1=conditionPart1(part1);
			System.out.println("Result of part1: (" + part1 + ") : " + result1);

			// Reverse String
			System.out.println("**************************");
			String result2=conditionPart2(part2);
			System.out.println("Reverse a String (" + part2 + ") : "+result2);

			// increment Characters in String
			System.out.println("***************************");
			String result3=conditionPart3(part3);
			System.out.println("increment Characters in String (" + part3 + ") : "+result3);


			System.out.println("******************************");
			System.out.println("Rearrangement of the give String: ");
			System.out.println(result3 + result1 + result2);

		}
	}
}
