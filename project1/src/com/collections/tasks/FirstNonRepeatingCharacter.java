package com.collections.tasks;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
public static void main(String[] args) {
	Map<Character,Integer> map = new HashMap<>();
	
	String s = " progra mming".trim();
	
	for(char ch:s.toCharArray()) {
		map.put(ch,map.getOrDefault(s, 0)+1);
	}
	
	for(char ch:s.toCharArray()) {
		if(map.get(ch) == 1) {
			System.out.println("First Non Repeating Charcter: "+ch);
			return;
		}
	}
}
}
