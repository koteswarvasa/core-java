package com.tasks.strings;

public class BiggestNum {
public static void main(String[] args) {
	System.out.println("main method started");
	
	String s = "1331313313";

	int max = 0;
	
	for(int i = 0;i<s.length();i++) {
		if(s.charAt(i) == '1') {
			String str = s.substring(0, i) + s.substring(i+1);
			
			int num = Integer.parseInt(str);
			
			max = Math.max(max, num);
		}
	}
	
	System.out.println("Biggest Sub String Number is : "+max);
	
}
}
