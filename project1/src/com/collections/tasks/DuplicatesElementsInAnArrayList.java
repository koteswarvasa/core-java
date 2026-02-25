package com.collections.tasks;

import java.util.ArrayList;
import java.util.List;

public class DuplicatesElementsInAnArrayList {
public static void main(String[] args) {
	List<Integer> list = new ArrayList<>(List.of(1,5,3,4,5,6,4,3));
	
	
	for(int i=0;i<list.size();i++) {
		for(int j=i+1;j<list.size();j++) {
			if(list.get(i) == list.get(j)) {
				list.remove(j);
			}
		}
	}
	
	System.out.println(list);
}
}
