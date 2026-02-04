package com.logicalstatements.patterns;

public class TestDemo18 {
	
					//	    A    
					//	   ABA   
					//	  ABCBA  
					//	 ABCDCBA 
					//	ABCDEDCBA
	
	public static void main(String[] args) {

		int n = 5;
		for (int i = 1; i <= n; i++) {
			// spaces
			for (int j = 1; j < n - i + 1; j++) {
				System.out.print(" ");
			}

			// stars
			char ch = 'A';
			int breakpoint = (2 * i - 1) / 2;
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print(ch);
				if(j<=breakpoint) {
					ch++;
				}else {
					ch--;
				}
			}

//	   spaces
			for (int j = 1; j < n - i + 1; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
