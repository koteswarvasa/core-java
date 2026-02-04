package com.operators;

public class UnaryTestDemo1 {

	// Unary operators
	// + - ++ --
	// pre increment - pre decrement
	// post increment - post decrement

	// ex: a++ : a=a+1
//	      ++a : a=a+1
//	      a-- : a=a-1
//	      --a : a=a-1		  

	public static void main(String[] args) {
		System.out.println("main method Started");
		int a = 5;
		int b = 10;

		System.out.println(+a);// 5
		System.out.println(-b);// -10

		System.out.println(a++);
		System.out.println(++a);
		System.out.println(++a);
		System.out.println(--a);
		System.out.println(a--);
		System.out.println(++a);
		System.out.println(a++);
		System.out.println(a--);

		System.out.println("******************************");
		System.out.println(b++);
		System.out.println(++b);
		System.out.println(++b);
		System.out.println(--b);
		System.out.println(b--);
		System.out.println(++b);
		System.out.println(b++);
		System.out.println(b--);

		System.out.println("A value: " + a);// 7
		System.out.println("B value: " + b);// 12

		System.out.println(a++ + b--);// 17
		
		System.out.println("A value: " + a);// 8
		System.out.println("B value: " + b);// 11
		
		System.out.println(++a + a++ + --b + b--);//38
		
		System.out.println("A value: " + a);// 10
		System.out.println("B value: " + b);// 9
		
		System.out.println(b++ + ++a + ++b + a++);//42
		
		System.out.println("A value: " + a);// 12
		System.out.println("B value: " + b);// 11
		
		System.out.println(a-- + --a + --b + b--);//42
		
		System.out.println("A value: " + a);// 10
		System.out.println("B value: " + b);// 9
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
