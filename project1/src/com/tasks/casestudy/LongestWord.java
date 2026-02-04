package com.tasks.casestudy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestWord {
public static void main(String[] args) {
	
//	String[] arr = {"java","is","simple","when","pratice","you","daily"};
	
//	String max=arr[0];
//	for(String s : arr) {
//		if(s.length()>max.length()) {
//			max=s;
//		}
//	}
//	System.out.println(max.length());
//	
//	for(int i=0;i<arr.length;i++) {
//		if(max.length()==arr[i].length()) {
//			System.out.print(arr[i]+" ");
//		}
//	}
	
	String[] arr = {"java","is","simple","when","pratice","koteswa","you","daily"};
	Map<Integer,List<String>> map = new HashMap<>();
	
	int maxL=0;
	
	for (String string : arr) {
		int len = string.length();
		
		map.putIfAbsent(len,new ArrayList<>());
		
		map.get(len).add(string);
		
		if(len>maxL) {
			maxL=len;
		}
	}
	
	System.out.println("Longest Words in the Array: "+map.get(maxL));
	System.out.println(map);
	
}
}
