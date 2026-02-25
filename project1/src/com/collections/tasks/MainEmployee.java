package com.collections.tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainEmployee {
public static void main(String[] args) {
	List<Employee> list = new ArrayList<>();
	
	Employee e1 = new Employee(1,"koti",23,34000);
	Employee e2 = new Employee(3,"krishna",24,35000);
	Employee e3 = new Employee(2,"laxman",25,50000);
	Employee e4 = new Employee(4,"kesava",21,43000);
	Employee e5 = new Employee(5,"siva",22,32000);
	
	list.add(e1);
	list.add(e2);
	list.add(e3);
	list.add(e4);
	list.add(e5);
	
//	for(Employee e : list) {
//		System.out.println(e.getEmpId()+" | "+e.getEmpName()+" | "+ e.getAge()+" | "+e.getSalary());
//	}
	
	for(Employee e : list) {
		System.out.println(e);
	}
	
	System.out.println("********************************");
	Collections.sort(list);
	
	for(Employee e : list) {
		System.out.println(e);
	}
	
	
}
}
