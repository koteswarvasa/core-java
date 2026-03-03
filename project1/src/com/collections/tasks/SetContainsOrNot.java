package com.collections.tasks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetContainsOrNot {
	public static void main(String[] args) {
			
		Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4,5));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(1,2,3,4));
		
		System.out.println(set1);
		System.out.println(set2);
		
		if(set1.containsAll(set2)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
}
