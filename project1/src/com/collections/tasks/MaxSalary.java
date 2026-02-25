package com.collections.tasks;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MaxSalary {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	Double[] arr = {1000.3,5000.3,6045.2,7895.4,2000.45};	
	
	List<Double> salaries = new ArrayList<>(List.of(arr));
	
//	int n = 5;
	
//	System.out.println("Enter the salaries: ");
//	for(int i=0;i<n;i++) {
//		salaries.add(sc.nextDouble());
//	}
	
	double maxSalary = Double.MIN_VALUE;
	
//	Using for each  or enhanced loop******************************
//	for(double salary : salaries) {
//		if(salary>maxSalary) {
//			maxSalary = salary;
//		}
//	}
	
	
//	Using Iterator***********************************************
	Iterator<Double> it = salaries.iterator();
	
	while(it.hasNext()) {
		double salary = it.next();
		if(salary> maxSalary) {
			maxSalary = salary;
		}
	}
	
	System.out.println("Maximum Salary in the given list: "+ maxSalary);
	
	sc.close();
}
}
