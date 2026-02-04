package com.operators;

public class UnaryTestDemo2 {
	public static void main(String[] args) {

		// example 1

//	int a=0;
//	a=a++ + ++a - a++ + ++a - ++a + a++;
//	System.out.println(a);

		// example 2
//	int x=3;
//	
//	int result=x++ - ++x + x-- + --x + ++x + ++x;
//	System.out.println(x);
//	System.out.println(result);

//	int a =1,b=1;
//	int c = a++ + ++b + a++ + b++;
//	System.out.println(c+" "+a+" "+b);

		int i = 0, j = 0;
		int k = ++i * ++j + i++ * j++ + ++i + j++;
		System.out.println(i+" "+j+" "+k);
		
		

	}
}
