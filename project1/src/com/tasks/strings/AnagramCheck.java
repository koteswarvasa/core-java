package com.tasks.strings;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
	public static boolean isAnagram(String s1,String s2) {
		if(s1.length() != s2.length()) {
			return false;
		}
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		return Arrays.equals(ch1, ch2);
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String1: ");
		String s1 = sc.nextLine();
		System.out.println("Enter a String1: ");
		String s2 = sc.nextLine();
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
	
		if(isAnagram(s1,s2)) {
			System.out.println("given Strings are anagrams");
		}else {
			System.out.println("given Strings are not anagrams");
		}
		

		
		sc.close();
		System.out.println("mai method ended");
	}
}
