package com.collections.tasks;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateElements {
	public static void main(String[] args) {
		int[] arr = { 1, 4, 6, 7, 4, 3, 1, 5, 4 };

		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();

		for (int i : arr) {
			if (!set1.add(i)) {
				set2.add(i);
			}
		}
		System.out.println(set2);
	}
}
