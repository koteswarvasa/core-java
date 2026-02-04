package com.tasks;

public class DecimalToBinary {
public static void main(String[] args) {
	int a=11;
	
	String result="";
	
	while(a!=0) {
		int rev=a%2;
		result=rev+result;
		a/=2;
	}
	
	System.out.println("Convert Decimal To Binary: "+result);
	
}
}
