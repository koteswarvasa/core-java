package com.logicalstatements.patterns;

public class TestDemo2 {
	
//	output:
	
//	******
//	*****
//	****
//	***
//	**
//	*
public static void main(String[] args) {
	
	for(int i=1;i<=6;i++) {
		for(int j=6;j>=i;j--) {
			System.out.print("*");
			}
		System.out.println();
		}
}
}
