package com.simplilearn.java.hello;

import java.util.Scanner;

public class HowOldRYou {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter your birth year: ");
		        int bYear = scanner.nextInt();
		        int age = 0;
		        
		        if (bYear < 0) {
					System.out.println("invalid age input. Age cannot be negative.");
				}
		           
		        else {		        
		        age = 2023 - bYear;		        		        
		        System.out.println("You are " + age 
		        		+ " years old if your birthday passed in the current year. ");
		        }
		        
		        
		        if (0 < age  && age< 16) {
		            System.out.println("You can't drive.");
		        } else if ((age >= 16) && (age <= 17)) {
		            System.out.println("You can drive but not vote.");
		        } else if ((age >= 18) && (age <= 24)) {
		            System.out.println("You can vote but not rent a car.");
		        } else if (age >24){
		            System.out.println("You can do pretty much anything.");
		        }
		      
		    }
	}


