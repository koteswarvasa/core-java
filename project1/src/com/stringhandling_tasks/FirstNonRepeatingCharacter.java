package com.stringhandling_tasks;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {
public static void main(String[] args) {
	String s = "swis s";
	
	HashMap<Character,Integer> map = new HashMap<>();
	
	for(char c:s.toCharArray()) {
		map.put(c, map.getOrDefault(c, 0)+1);
	}
//	
	for(int i=0;i<s.length();i++) {
		char c = s.charAt(i);
		if(map.get(c) == 1) {
			System.out.println(c);
			break;
		}
	}
	
	
//	for(int i=0;i<s.length();i++) {
//		int count=0;
//		for(int j=0;j<s.length();j++) {
//			if(s.charAt(i)==s.charAt(j)) {
//				count++;
//			}
//		}
//		if(count==1) {
//			System.out.println(s.charAt(i));
//			break;
//		}
//	}
	
	
//	for(int i=0;i<s.length();i++) {
//		char c = s.charAt(i);
//		if(s.indexOf(c) == s.lastIndexOf(c)) {
//			System.out.println(c);
//			break;
//		}
//	}
	
}
}
