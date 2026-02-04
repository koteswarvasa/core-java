package com.langfundamentals;

public class DataTypes02 {
	byte b;
	//Byte = 1 byte = 8 bits 
	//range ==>-128 to 127
	    //-128,-127,-126....0,1,2,3......126,127  
	
	//If we give morethan byte value,we will get below error
	  //compile time error:Type mismatch:cannot convert from int to byte
    //Type Casting:Converting the data from one data type to another type is clled Type casting.
	
	byte b1=127;
	byte b2=(byte)128;  //This is called Explicit type casting
	byte b3=(byte) -127;
	byte b4=(byte)256;
	
	
	short s;
	//short = 2 bytes = 16 bits
	// 2^15 ===> range -32768 to 32767
	//If we give morethan short value,we will get below error
	//compile time error:Type mismatch:cannot convert from int to short
	
	short s1=32767; 
	short s2=(short)32768;
	short s3=(short)-32769;
	
	
	int i;
	//int = 4 bytes = 32 bits
	//2^31 ==> range -2147483648 to 2147483647
	//If we give morethan int value,we will get below error
	//the literal (num) out of range
	
	int i1=2147483647;
	int i2=-2147483648;
	int i3=(int)2147483648L; //This is Explicit Type Casting long to int..
	
	long l;
	//long = 8 bytes = 64 bits;
	//2^63 ==>range -2^63 to 2^63-1  -922337203684775808  to  922337203684775807
	//l or L is caseinsensitve
	
	long l1=2147483647;  //int to long Implicit type casting
	long l2=2147483648L;
	long l3=21474836474567890L;
	
	
	
	//By default any floating number from RHS is consider as double only.
	float f;
	//float takes 6-77 values after decimal point
	float f1= 45.35345678f;
	float f2=34.22f;
	
	
	double d;
	//double takes 15 to 168 values
	double d1=45.123456789009876543;
	double d2=20.3656567;
	
	
	//particularly print certain number of values  after decimal point
	double num;
	double num2;
    float num3;
	
	
	public static void main(String[] args) {
		DataTypes02 t1=new DataTypes02();
		System.out.println("byte value:"+t1.b);
		System.out.println("byte value:"+t1.b1);
		System.out.println("byte value:"+t1.b2);
		System.out.println("byte value:"+t1.b3);
		System.out.println("byte value:"+t1.b4);
		System.out.println();
		
		System.out.println("short value:"+t1.s);
		System.out.println("short value:"+t1.s1);
		System.out.println("short value:"+t1.s2);
		System.out.println("short value:"+t1.s3);
		System.out.println();
		
		System.out.println("int value:"+t1.i);
		System.out.println("int value:"+t1.i1);
		System.out.println("int value:"+t1.i2);
		System.out.println();
		
		System.out.println("long value:"+t1.l);
		System.out.println("long value:"+t1.l1);
		System.out.println("long value:"+t1.l2);
		System.out.println("long value:"+t1.l3);
		System.out.println();
		
		System.out.println("float value:"+t1.f);
		System.out.println("float value:"+t1.f1);
		System.out.println("float value:"+t1.f2);
		System.out.println();
		
		System.out.println("double value:"+t1.d);
		System.out.println("double value:"+t1.d1);
		System.out.println("double value:"+t1.d2);
		System.out.println();
		
		t1.num=365;
		t1.num2=45.34532;
	
		System.out.printf("%.2f",t1.num);
		System.out.println();
		System.out.printf("%.3f",t1.num2);
		
		t1.num3=45.3f;
		System.out.println();
		System.out.printf("%.9f",t1.num3);
		
	}
}
