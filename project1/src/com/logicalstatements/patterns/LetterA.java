package com.logicalstatements.patterns;

public class LetterA {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j == (5 - (i - 1)) || j == (5 + (i - 1)) || (i == 3 && j > 2 && j < 8)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}
