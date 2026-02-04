package com.tasks;

public class ReverseOfANumber {
	
public static void main(String[] args) {
	int num=234;
	int rev=0;
	
	while(num!=0) {
		rev=rev*10+num%10;
		num/=10;
	}
	System.out.println(rev);
}
}
