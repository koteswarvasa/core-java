package com.langfundamentals;

public class DataTypes01 {
	byte b;
	short s;
	int i;
	long l;
	
	float f;
	double d;
	
	char ch;
	boolean boo;
	
	
	public static  void main(String [] args) {
		System.out.println("main method started...");
		
		DataTypes01 t1=new DataTypes01();
		//t1.i=200;
		
		System.out.println("....garbage values or default values....");
		
		System.out.println("Byte Value:"+t1.b);
		System.out.println("Short value:"+t1.s);
		System.out.println("Int value:"+t1.i);
		System.out.println("long value:"+t1.l);
		
		System.out.println("float value"+t1.f);
		System.out.println("double value:"+t1.d);
		
		System.out.println("Char value:"+t1.ch);
		
		System.out.println("boolean value:"+t1.boo);

	}
}
