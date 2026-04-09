package com.logicalstatements.patterns;

public class TestDemo4 {
	
//				    *
//				   **
//				  ***
//				 ****
//				*****
//			   ******
//				
//			   ******
//				*****
//				 ****
//				  ***
//				   **
//    				*
	
	
	
	public static void main(String[] args) {

		for(int i=1;i<=6;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=6;j++) {
				if(j<=i-1) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
