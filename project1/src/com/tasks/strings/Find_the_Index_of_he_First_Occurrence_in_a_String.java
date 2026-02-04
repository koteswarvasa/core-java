package com.tasks.strings;

public class Find_the_Index_of_he_First_Occurrence_in_a_String {
	
	public static int firstIndexOccurrence(String haystack,String needle) {
		
		if(haystack.length()<needle.length()) {
			return -1;
		}
		
		for(int i=0;i<haystack.length()-needle.length();i++) {
			
			int j=0;
			while(j<needle.length() && haystack.charAt(i+j)==needle.charAt(j)) {
				j++;
			}
			
			if(j==needle.length()) {
				return i;
			}
		}
		return -1;
	}
public static void main(String[] args) {
	String haystack="leetcode";
	String needle = "e";
	
	System.out.println(firstIndexOccurrence(haystack.toLowerCase(),needle.toLowerCase()));
}
}
