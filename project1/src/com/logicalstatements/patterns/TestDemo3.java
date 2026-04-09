package com.logicalstatements.patterns;

public class TestDemo3 {
	
//	output:
//	*
//	**
//	***
//	****
//	*****
//	******
//	*****
//	****
//	***
//	**
//	*
	
	
public static void main(String[] args) {
//	for(int i=1;i<=6;i++) {
//		for(int j=1;j<=i;j++) {
//			System.out.print("*");
//			}
//		System.out.println();
//		}
//	
//	for(int i=1;i<=6;i++) {
//		for(int j=5;j>=i;j--) {
//			System.out.print("*");
//		}
//		System.out.println();
//	}
	
	int n=5;
	
	for(int i=1;i<=2*n-1;i++) {
		int stars=i;
		if(i>n) {
			stars=2*n-i;
		}
		for(int j=1;j<=stars;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	
}
}
