package com.logicalstatements.patterns;

public class LetterK {
public static void main(String[] args) {
	int n
	=5;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
//			if(j==1 || (i==1 && j==5) || (i==2 && j==4) || (i==3 && j==3) || (i==4 && j==4) || (i==5 && j==5)) {
//				System.out.print("*");
//			}else {
//				System.out.print(" ");
//			}
			
			if(j==1) {
				System.out.print("*");
			}
		else if(i<=(n/2)+1 && j==(n-i+1)){
				System.out.print("*");
			}else if(i>(n/2)+1 && j==i){
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
