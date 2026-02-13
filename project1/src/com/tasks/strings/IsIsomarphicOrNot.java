package com.tasks.strings;

import java.util.Scanner;

public class IsIsomarphicOrNot {

	public static boolean isIsomarphic(String s1, String s2) {

		if (s1.length() != s2.length()) {
			return false;
		}

//		int[] ch1 = new int[127];
//		int[] ch2 = new int[127];
//		
//		for(int i=0;i<s1.length();i++) {
//			char c1 = s1.charAt(i);
//			char c2 = s2.charAt(i);
//			
//			if(ch1[c1] != ch2[c2]) {
//				return false;
//			}
//			
//			ch1[c1] = i+1;
//			ch2[c2] = i+1;
//		}

		for (int i = 0; i < s1.length(); i++) {
			char c1 = s1.charAt(i);
			char c2 = s2.charAt(i);
			if ((s1.indexOf(c1) != s2.indexOf(c2)) || (s1.lastIndexOf(c1) != s2.lastIndexOf(c2))) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String 1: ");
		String s1 = sc.nextLine();
		System.out.println("Enter a String 2: ");
		String s2 = sc.nextLine();

		if (isIsomarphic(s1, s2)) {
			System.out.println("given Strings are Isomarphic");
		} else {
			System.out.println("Given Strings are Not Ismorphic");
		}

		sc.close();
	}
}
