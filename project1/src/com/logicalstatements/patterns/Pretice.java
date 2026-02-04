package com.logicalstatements.patterns;

public class Pretice {
public static void main(String[] args) {
	
//	int n=7;
//	for(int i=1;i<=n;i++) {
//		for(int j=1;j<=n;j++) {
//			if((j==1 || j==n) && (i>1 && i<n)) {
//				System.out.print("*");
//			}
//			else if(i>1 && i<n) {
//				System.out.print("$");
//			}else {
//         System.out.print("*");
//			}
//	}
//		System.out.println();
//}
	
	
	
	int n=5;
	int spaces=2*n-2;
	for(int i=1;i<=2*n;i++) {
		int star=i;
		if(i>n) {
			star=2*n-i;
		}
		
		//stars
		for(int j=1;j<=star;j++) {
			System.out.print("*");
		}
		
		//spaces
		for(int j=1;j<=spaces;j++) {
			System.out.print(" ");
		}
		
		for(int j=1;j<=star;j++) {
			System.out.print("*");
		}
		
		if(i<n) {
			spaces-=2;
		}else {
			spaces+=2;
		}
		System.out.println();
	}
}
}
