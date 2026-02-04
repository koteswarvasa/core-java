
package com.operators;

//Assignment Operators  = += -= *= /= %=
public class AssignmentOperators {
	public static void main(String[] args) {
		System.out.println("main method strated !!");
		int a = 9;
		int result = 0;
		result = result + 9;
//		result = result + 5.5;//Type mismatch: cannot convert from double to int
		result += 5.5;// compound operators --> result = result + 5.5 --> 14
		System.out.println("result : " + result);// Error
		result -= 5;// result = result-5;
		System.out.println("result : " + result);// 9
//		result = result * 5.5;
		result *= 5.5;
		System.out.println("result : " + result);// 49
		result /= 4.5;// result = result/4.5; --> 10 --> 4.5)49(10
//														    45
//														    ----4
		System.out.println("result : " + result);//
		result %= 2.5;// result = result % 2.5 --> 2.5)10(4
		System.out.println("result : " + result);
		
		
		int x=2;
	    x+=3.8;
	}
}
