package com.tasks.arrays;

public class SingleDigitCount {
	
	static int digits(int a) {
		
		int sum=0;
		while(a!=0) {
			int r=a%10;
			sum+=r;
			a/=10;
		}
		
		if(sum>9) {
			return digits(sum);
		}
		return sum;
	}
public static void main(String[] args) {
	int a=987;
	System.out.println(digits(a));
}
}
