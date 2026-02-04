package com.tasks.strings;

public class ReverseFirsAndSecondHalfString {
public static void main(String[] args) {
	String s = "Amalapuram";
	
	String s1 = s.substring(0,s.length()/2);
	String s2 = s.substring(s.length()/2,s.length());
	
	
	String result ="";
	for(int i=0;i<s1.length();i++) {
		result=s1.charAt(i)+result;
	}
	
//	System.out.println(result);
	
	for(int i=s2.length()-1;i>=0;i--) {
		result+=s2.charAt(i);
	}
	
	System.out.println(result);
}
}
