package com.langfundamentals.typeofmethods;

import java.util.Scanner;

public class TestMDemo7 {

	// with return type and with arguments
	/*
	 * 
	 * 1.it is used for the take the arguments someWhere and return SomeValue use in
	 * somewhere
	 * 
	 */

	// WAP to calculate the area of Rectangle,Square,Triangle,Circle

	int areaRectangle(int l, int b) {
		return l * b;
	}
	
	int areaSquare(int side) {
		return side*side;
	}
	
	double areaTriangle(int base,int height) {
		return (0.5)*base*height;
	}
	
	double areaCircle(int radius) {
		return Math.PI*radius*radius;
	}

	void main() {
		System.out.println("main method started!...");
		Scanner sc = new Scanner(System.in);
		System.out.println();

		          //Area of the Rectangle
		System.out.println("calculate Area of The Rectangle");
		System.out.println("Enter length: ");
		int l = sc.nextInt();

		System.out.println("Enter Breadth: ");
		int b = sc.nextInt();

		float aRectangle = areaRectangle(l, b);
		System.out.println("Area Of The Rectangle: " + aRectangle);
		System.out.println();
		
		        //Area of The Square
		System.out.println("Calculate Area of The Square");
		System.out.println("Enter side: ");
		int side = sc.nextInt();
		
		int aSquare=areaSquare(side);
		System.out.println("Area of The Square: "+aSquare);
		System.out.println();
		
		         //Area Of The Triangle
		System.out.println("Calculate Area Of The Triangle");
		System.out.println("Enter Base: ");
		int base = sc.nextInt();

		System.out.println("Enter Height: ");
		int height = sc.nextInt();

		double aTriangle = areaTriangle(base, height);
		System.out.println("Area Of The Triangle: " + aTriangle);
		System.out.println();
		
                 //Area of The Square
		System.out.println("Calculate Area of The Square");
		System.out.println("Enter radius: ");
		int radius = sc.nextInt();
		
		double aCircle=areaCircle(radius);
		System.out.println("Area of The Square: "+aCircle);
		
		

		sc.close();

	}
}
