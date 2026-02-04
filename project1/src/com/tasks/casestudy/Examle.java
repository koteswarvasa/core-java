package com.tasks.casestudy;

import java.util.*;

public class Examle {
	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				list1.add(i);
			} 
			if(i%3==0) {
				list2.add(i);
			}
		}
		
		System.out.println(list1);
		System.out.println(list2);
		
		list1.retainAll(list2);
		
		System.out.println(list1);
	}
}
