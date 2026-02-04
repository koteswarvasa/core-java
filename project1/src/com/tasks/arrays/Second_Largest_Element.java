package com.tasks.arrays;

public class Second_Largest_Element {
public static void main(String[] args) {
	
	int[] arr = {1,3,5,7,6};
	
	int max=0;
	int sec=0;
	
	for (int i : arr) {
		if(i>max) {
			sec=max;
			max=i;
		}
			else if(i>sec && i!=max) {
			sec=i;
		}
	}
	
	System.out.println(max);
	System.out.println(sec);
	
	
	
}
}
