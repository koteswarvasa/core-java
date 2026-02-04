package com.tasks.arrays;

import java.util.LinkedHashSet;

public class Problem1 {
public static void main(String[] args) {
	String[] s = {"tommy","john","tommy","abcd","john"};
		
//	LinkedHashSet<String> lhs = new LinkedHashSet<>();
//	for(String s1:s) {
//		lhs.add(s1);
//	}
//	
//	System.out.println(lhs);
	
	
	boolean[] visit = new boolean[s.length];
	
	for(int i=0;i<s.length;i++) {
		int count = 0;
		for(int j=0;j<s.length;j++) {
			if(s[i].equals(s[j]) && !visit[i]) {
				visit[j]= true;
				count++;
			}
		}
		if(count>1) {
			System.out.print(s[i]+" , ");
		}
	}
	
	for(int i=0;i<s.length;i++) {
		int count = 0;
		for(int j=0;j<s.length;j++) {
			if(s[i].equals(s[j])) {
				count++;
			}
		}
		if(count==1) {
			System.out.print(s[i]);
		}
	}
}
}
