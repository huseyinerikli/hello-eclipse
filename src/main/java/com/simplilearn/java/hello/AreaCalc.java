package com.simplilearn.java.hello;

import java.util.Arrays;
import java.util.Scanner;

public class AreaCalc {
	public double area_circle(int radius) {
		return (double) Math.PI * (radius * radius);
	}

	public int area_rectangle(int length, int width) {
		return length * width;
	}

	public int area_square(int side) {
		return side * side;
	}

	public double area_triangle(int base, int height) {
		return (base * height) / 2;
	}

	public static void main(String[] args) {

		AreaCalc resTri = new AreaCalc();
		AreaCalc resRect = new AreaCalc();
		AreaCalc resSqr = new AreaCalc();
		AreaCalc resCirc = new AreaCalc();
				
		System.out.println("1. Triangle");
		System.out.println("2. Rectangle");
		System.out.println("3. Square");
		System.out.println("4. Circle");
		System.out.println("5. Quit");
		System.out.print("Which shape?: ");

		Scanner sc = new Scanner(System.in);
		int shapeNum = sc.nextInt();

		switch (shapeNum) {
		case 1:
			System.out.print("Base: ");
			int base = sc.nextInt();
			System.out.print("Height: ");
			int height = sc.nextInt();
			double areaOfTriangle = resTri.area_triangle(base, height);
			System.out.println("The area is: " + areaOfTriangle);
			break;

		case 2:
			System.out.print("Lenght: ");
			int lenght = sc.nextInt();
			System.out.print("Width: ");
			int width = sc.nextInt();
			int areaOfRectangle = resRect.area_rectangle(lenght, width);
			System.out.println("The area is: " + areaOfRectangle);
			break;

		case 3:
			System.out.print("Side length: ");
			int side = sc.nextInt();
			int areaOfSquare = resSqr.area_square(side);
			System.out.println("The area is: " + areaOfSquare);
			break;

		case 4:
			System.out.print("Radius: ");
			int radius = sc.nextInt();			
			double areaOfCircle = resCirc.area_circle(radius);
			System.out.println("The area is: " + areaOfCircle);
			break;

		case 5:
			System.out.println("Goodbye!");
			break;

		default:
			System.out.println("Invalid choice. Please try again.");
		}
	}
}
