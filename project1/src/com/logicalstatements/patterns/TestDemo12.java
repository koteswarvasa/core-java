package com.logicalstatements.patterns;

public class TestDemo12 {
public static void main(String[] args) {
	int n=6;
	int star = 0;
	for(int i=1;i<=n;i++) {
		if(n%2==0) {
		if(i%2==0) {
			star=0;
		}else {
			star =1;
		}
		
		for(int j=1;j<=n;j++) {
			System.out.print(star+" ");
			star=1-star;
		}
		System.out.println();
	}
		else {
			for(int j=1;j<=n;j++) {
				if(j%2==1) {
				System.out.print("1 ");
//				star=1-star;
			}else {
				System.out.print("0 ");
			}
			}
			System.out.println();
			}
		}
	}
	
	
}

