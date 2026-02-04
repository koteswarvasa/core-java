package com.logicalstatements.patterns;

public class TestDemo16 {
	
					//	A B C D E 
					//	A B C D 
					//	A B C 
					//	A B 
					//	A 

public static void main(String[] args) {
	int n=5;
	char ch ='A';
	for(int i=1;i<=n;i++) {
		int b=1;
		for(int j=n;j>=i;j--) {
			System.out.print((char)(ch+ b++ + -1)+" ");
		}
		System.out.println();
	}
}
}
