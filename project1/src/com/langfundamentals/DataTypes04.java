package com.langfundamentals;

import java.math.BigInteger;
import java.math.BigDecimal;

public class DataTypes04 {
	
	//Normal Object Data types
	String s;
	String s1="lucky pala";
	
	BigInteger b=new BigInteger("234567890987654456789876545678998765456789876"); //string
	BigInteger b1=new BigInteger("20098765456789987653456789876556775678765567");
	
	BigDecimal d=new BigDecimal(233338765);  //int
	BigDecimal d1=new BigDecimal("7898764345678987654.2232323323"); //String 
	BigDecimal d2=new BigDecimal('a');   //char
	BigDecimal d3=new BigDecimal(233333456765456765L); //long 
	BigDecimal d4=new BigDecimal(23333345676545676.322); //double
	BigDecimal d5=new BigDecimal(b1);  //BigInteger
	
	
	BigDecimal bd1=new BigDecimal("6789898764345678987654.223987652323323");
	BigDecimal bd2=new BigDecimal("76372898764345678987654.22323233238765");
	
	//Bigdecimal can store BigInteger values,char values,int valuues,long values,double values..etc

	
	
	
	
	void main() {
		System.out.println("main method started..");
		DataTypes04 t1=new DataTypes04();
		
		System.out.println("String value:"+t1.s);
		System.out.println("String value:"+t1.s1);
		System.out.println();
		
		System.out.println("Big Integer value:"+t1.b);
		System.out.println("Big Integer value:"+t1.b1);
		System.out.println("sum:"+t1.b.add(t1.b1));
		System.out.println("Multiplication:"+t1.b.multiply(t1.b1));
		System.out.println("subtract:"+t1.b.subtract(t1.b1));
		System.out.println("Division:"+t1.b.divide(t1.b1));
		System.out.println("modulas:"+t1.b.mod(t1.b1));
		System.out.println("Equal or not:"+t1.b.equals(t1.b1));
		System.out.println("max num:"+t1.b.max(t1.b1));
		System.out.println("min num:"+b.min(b1));
		System.out.println();
		
		
		
		//we can access also without createing object
		System.out.println("Big decimal (Int) value:"+t1.d);
		System.out.println("Big decimal  (string )value:"+t1.d1);
		System.out.println("Big decimal (char) value:"+t1.d2);
		System.out.println("Big decimal (long) value:"+t1.d3);
		System.out.println("Big decimal (double) value:"+t1.d4);
		System.out.println("Big decimal (Big Integer )value:"+t1.d5);
		System.out.println("Big decimal val:"+bd1);
		System.out.println("Big decimal val:"+bd2);
		System.out.println("sum:"+bd1.add(bd2));
		System.out.println("subtract:"+bd1.subtract(bd2));
		System.out.println("multiply:"+bd1.multiply(bd2));
		//System.out.println(bd1.divide(bd2));
		System.out.println("maximum:"+bd1.max(bd2));
		System.out.println("minimum:"+bd1.min(bd2));
		System.out.println("equal or not:"+bd1.equals(bd1));
		System.out.println();
		
		
		
	}
}
