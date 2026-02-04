package com.logicalstatements.forloop;

import java.util.Scanner;

public class PerfectCubeNumber {
	static Scanner sc = new Scanner(System.in);

	public static boolean isPerfectCube(int n) {
		if(n<0) {
			return isPerfectCube(-n);
		}else {		
		for(int i=1;i<=(n/2);i++) {
			int check =i*i*i;
			if(n==check) {
				return true;
			}
		}
		return false;
	}
	}

	public static void main(String[] args) {
		while(true){
		System.out.println("Enter a Number:  ");
		int n = sc.nextInt();
		
		if(n==0) {
			System.out.println("Existing.....");
			break;
		}

		if (isPerfectCube(n)) {
			System.out.println("Given Number is perfect Cube!...");
		} else {
			System.out.println("Given Number is not a perfect Cube!...");
		}

	}
}
}