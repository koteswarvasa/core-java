package com.tasks.arrays;

public class CountVowels {
	static int countVowels(String s) {
		int count=0;
		
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				count++;
			}
		}
		return count;
	}
public static void main(String[] args) {
	
	String s="hello world";
	
    System.out.println("Count Vowels in a String: "+countVowels(s));
    
}
}
