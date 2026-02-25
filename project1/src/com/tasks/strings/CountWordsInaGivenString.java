package com.tasks.strings;

public class CountWordsInaGivenString {
public static void main(String[] args) {
	String input  = "java hello java string string string";
	
	String[] inputSplit = input.split(" ");
	
	boolean[] visit = new boolean[inputSplit.length];
	
	for(int i=0;i<inputSplit.length;i++) {
		
		if(visit[i]) {
			continue;
		}
		
		int count = 0;
	
		for(int j=i;j<inputSplit.length;j++) {
			if(inputSplit[i].equals(inputSplit[j])) {
				count++;
				visit[j] = true;
			}
		}
		System.out.println(inputSplit[i]+" = "+count+" ");
	}
}
}
