package com.tasks.casestudy;

import java.util.Scanner;

public class Restaurant {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double totalBill=0;
	System.out.println("A Restaurant wants totalBill and Average Price ");
	System.out.println("How many food items we Ordered: ");
	int NumberOffoodItems=sc.nextInt();
	
	for(int i=1;i<=NumberOffoodItems;i++) {
		System.out.println("Enter price item "+i);
		double priceItem=sc.nextDouble();
		totalBill+=priceItem;
	}
	
	System.out.println("Total Bill for the food items in restaurants: "+totalBill);
	sc.close();
}
}
