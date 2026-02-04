package com.tasks.arrays;

public class LcmAndHcf {
public static void main(String[] args) {
	
	int a = 24,b=36;
	int c=24,d=36;
	
	while(b!=0) {
		int temp=b;
		b=a%b;
		a=temp;
	}
	
	
	int lcm=(c*d)/a;
	System.out.println(a);
	System.out.println(lcm);
}
}
