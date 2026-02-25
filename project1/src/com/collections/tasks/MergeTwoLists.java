package com.collections.tasks;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoLists {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,3};
		int[] arr2 = {3,4,5};
				
		List<Integer> list = new ArrayList<>();
		
		for(int i:arr1) {
			if(!list.contains(i))
				list.add(i);
		}
		
		for(int i:arr2) {
			if(!list.contains(i))
				list.add(i);
		}
		
		System.out.println(list);
	}
}
