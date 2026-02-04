package com.logicalstatements.patterns;

public class TestDemo15 {
	
				//	A 
				//	A B 
				//	A B C 
				//	A B C D 
				//	A B C D E 
	
public static void main(String[] args) {
	int n=5;
//	char ch ='A';
	for(int i=1;i<=n;i++) {
		for(char ch='A';ch<='A'+i-1;ch++) {
			System.out.print(ch);
//			System.out.print((char)(ch+j-1)+" ");
		}
		System.out.println();
	}
}
}
