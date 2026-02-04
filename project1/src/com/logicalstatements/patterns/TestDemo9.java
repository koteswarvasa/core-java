package com.logicalstatements.patterns;

public class TestDemo9 {
	
//	a
//	bb
//	ccc
//	dddd
//	eeeee
//	ffffff

public static void main(String[] args) {
	//int count=0;
	for(int i=1;i<=6;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print((char)('a'+i-1));
		}
		System.out.println();
	}
}
}
