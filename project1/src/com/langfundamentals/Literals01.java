package com.langfundamentals;

public class Literals01 {
	//Integral literals
	//Decimal literals
	int a=4;
	int b=65;
	int c=99;
	int d=123;
	
	//Octal literals
	//calculate octal values for 0123
	//0*8^3 + 1*8^2 + 2*8^1 + 3*8^0
	int a1=0123;
	int a2=0342;
	int a3=0456;
	int a4=0560;
	
	
	//Hexa-Decimal literals
	//calculate Hexa decimal value for 0x789
	//7*16 + 8*16^1 + 9*16^0
	int b1=0x789;
	int b2=0x23AB9;
	int b3=0xADD;
	int b4=0xdad;
	int b5=0xBee;
	int b6=0x123Ad;
	int b7=0xAdd1;
	
	//floating Literals
	float f1=256;
	float f2=2567F;
	//float f3=276.6;  error occur 'F' no there
	float f3=276.67F;
	float f4=1122F;
	float f5=01234.6F;
	float f6=0232F;
	float f7=0x435F;
	float f8=0x234F;
	//float f9=0x12345.34F; Error must be occured
	//float f10=0x1234.5;
	float f11=0x8FAd53;
	float f12=0xF;
	float f13=0xF1F;
	float f14=0xFF;
	
	
	//Floating literals in Double points
	double d1=15;
	double d2=345.34;
	double d3=234.23D;
	double d4=01234;
	double d5=0123.23;
	double d6=0123.23D;
	double d7=011;
	double d8=011.1;
	double d9=0x123;
	double d10=0x254F;
	double d11=0xDAD;
	//double d12=0xDa.23;  error
	
	//char literals
	char ch='A';
	char ch2=97;
	char ch3='\u0040';
	
	//String literals
	String str="Lucky pala";
	
	//null literals
	String a11=null;
	
	//Boolean literalls
	boolean isTasty=true;
	boolean istasty=false;
	
			
	 void main() {
		
		System.out.println("main method started.....");
		System.out.println("=========Decimal literals ========");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		System.out.println("====== Octal literals =======");
		System.out.println(a1);
		//0*8^3 + 1*8^2 + 2*8^1 + 3*8^0
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		
		System.out.println("====== Hexa Decimal literals =======");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b5);
		System.out.println(b6);
		System.out.println(b7);
		
		System.out.println("======= Floating Literals ======= ");
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f4);
		System.out.println(f5);
		System.out.println(f6);
		System.out.println(f7);
		System.out.println(f8);
		System.out.println(f11);
		System.out.println(f12);
		System.out.println(f13);
		System.out.println(f14);
		
		System.out.println(" ======= Double Literals ======");
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);
		System.out.println(d6);
		System.out.println(d7);
		System.out.println(d8);
		System.out.println(d9);
		System.out.println(d10);
		System.out.println(d11);
		
		System.out.println("====== Char literals ======");
		System.out.println(ch);
		System.out.println(ch2);
		System.out.println(ch3);
		
		System.out.println("======= String literals =======");
		System.out.println(str);
		
		System.out.println("====== null literal =====");
		System.out.println(a11);
		
		System.out.println("======== Boolean literal ======== ");
		System.out.println(istasty);
		System.out.println(isTasty);
		
	}

}
