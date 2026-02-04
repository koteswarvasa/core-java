package com.tasks.arrays;

public class TimeConversion {
public static void main(String[] args) {
	
	String s = "12:05 AM";
	
	String[] parts=s.split(" ");
	
	String time=parts[0];
	String period = parts[1];
	
	String[] hm = time.split(":");
	
	int hh =Integer.parseInt(hm[0]);
	int mm =Integer.parseInt(hm[1]);
	
	if(period.equals("AM")){
		if(hh==12) hh=00;
	}else {
		if(hh!=12) hh+=12;
	}
	
	System.out.printf("%02d:%02d",hh,mm);
	
}
}
