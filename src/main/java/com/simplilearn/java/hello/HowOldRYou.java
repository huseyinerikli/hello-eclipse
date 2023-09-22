package com.simplilearn.java.hello;

import java.util.Scanner;

public class HowOldRYou {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter your age: ");
		        int age = scanner.nextInt();
		        if (age < 16) {
		            System.out.println("You can't drive.");
		        } else if (age >= 16 && age <= 17) {
		            System.out.println("You can drive but not vote.");
		        } else if (age >= 18 && age <= 24) {
		            System.out.println("You can vote but not rent a car.");
		        } else {
		            System.out.println("You can do pretty much anything.");
		        }
		      
		    }
	}


