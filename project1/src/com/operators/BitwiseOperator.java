package com.operators;

public class BitwiseOperator {
public static void main(String[] args) {
	//bitwise operator
//	        -it is used to check the two boolean expression
//	         and give the boolean value
	
//	   		-and also check the integers values also and prints 
//	   		 the integer values
	
	System.out.println("===== & =====");
	System.out.println(true & true);  //true
	System.out.println(true & false);  //false
	System.out.println(false & true);  //false
	System.out.println(false & false);  //false
	
	System.out.println("***************************");
	System.out.println(53 & 4);//4
	System.out.println(3 & 1);//1
	System.out.println(78 & 45);//12
	System.out.println(9 & 67);//1
	
	System.out.println("===== | =====");
	System.out.println(true | true);  //true
	System.out.println(true | false);  //true
	System.out.println(false | true);  //true
	System.out.println(false | false);  //false
	
	System.out.println("********************************");
	System.out.println(53 | 4);//53
	System.out.println(3 | 1);//3
	System.out.println(78 | 45);//111
	System.out.println(9 | 67);//75
	
	System.out.println("==== ^ ====");
	System.out.println(true ^ true);  //false
	System.out.println(true ^ false);  //true
	System.out.println(false ^ true);  //true
	System.out.println(false ^ false);  //false
	
	System.out.println("*********************************");
	System.out.println(53 ^ 4);//49
	System.out.println(3 ^ 1);//2
	System.out.println(78 ^ 45);//99
	System.out.println(9 ^ 67);//74
	
	System.out.println("===== ~ =====");
	System.out.println(~23);      //x=-(x+1)
	System.out.println(~(-34));   //x=-(x+1)
	
	//Bitwise left shift and Bitwise right shift
	
//    Bitwise left shift (<<)
//	       - bits move to left side
	
//    Bitwise left shift (>>)
//         - bits move to right side
	
	System.out.println("===== Bitwise left shift (<<) =====");
	System.out.println(2 << 4);  //32
	System.out.println(2 >> 4);  //0
	System.out.println(2 >>> 4); //0
	System.out.println(4 << 2); //16
	
	
}
}
