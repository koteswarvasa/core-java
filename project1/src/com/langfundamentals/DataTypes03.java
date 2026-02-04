package com.langfundamentals;

import java.math.BigInteger;  
import java.math.BigDecimal;///fully loaded name

public class DataTypes03 {
	
	// byte --> short --> int --> long --> float -->double //Implicit Type casting
	
	float f;
	float f1=32.89f;
	float f11=100; // int to float ==>  implicit Type cating 
	float f3=234567876543212345676543223454323454322.23f;
	//float can store 6 to 7 decimal digits
	//Ex:float f=99.36f;
	
	
	double d;
	double d1=34.333D;
	double d2=199;
	//double can store 15 to 16 decimal digits
	
	char ch='A'; 
	char ch2=97;  //Ascii code  // int to char ==> implicit Type casting
	char ch3='\u0040'; //unicode character
	char ch4=546; //geater than 127 that will be junk char
	char ch5=65535;  //65535 is maximum range
	//A=65 B=66 .. Z=90  a=97 b=98  ..z=122
	//Numbers also store into char
	//2 byte = range = 32768+32767 ==> max range of char:65535
	//Single character in single quote
	//char can store 2 bytes (unicode support)
	//16 bits
	
	int a='A';  // char to int ALSO possible 
	
	boolean flag=true;
	//1 bit only
	//stores true or false 
	
	
	//object data types...
    String s;
    
    //wrapper object data types
    Byte b;
    Short s1;
    Integer i;
    Long l;
    
    Float f2;
    Double d3;
    
    Character ch1;
    Boolean b1;
    
    //Normal object data types
    BigInteger boo1;
    BigDecimal boo2;
    
	
	
	
	void main() {
		DataTypes03 t1=new DataTypes03();
		System.out.println("float value:"+t1.f);
		System.out.println("float value:"+t1.f1);
		System.out.println("float value:"+t1.f11);
		System.out.println("float value:"+t1.f3);
		System.out.println();
		
		System.out.println("double value"+t1.d);
		System.out.println("double value"+t1.d1);
		System.out.printf("double value after decimal :"+"%.2f",t1.d2);
		System.out.println();
		System.out.println();
		
		System.out.println("char value:"+t1.ch);
		System.out.println("char value:"+t1.ch2); //a
		System.out.println("int value to char:"+t1.a);
		System.out.println("unicode  char:"+t1.ch3);
		System.out.println("junk  char:"+t1.ch4);
		System.out.println("junk  char:"+t1.ch5);
		System.out.println();
		
		System.out.println("heyyy my loevely lalana...//");
		System.out.println("boolean value:"+t1.flag);
		System.out.println();
		
		
		//Object data types default value must be null
		System.out.println(t1.s);
		System.out.println(t1.b);
		System.out.println(t1.s1);
		System.out.println(t1.i);
		System.out.println(t1.l);
		System.out.println(t1.f2);
		System.out.println(t1.d3);
		System.out.println(t1.ch1);
		System.out.println(t1.b1);
		
		System.out.println(t1.boo1);
		System.out.println(t1.boo2);
		
		
		
		
	}

}
