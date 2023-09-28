package com.simplilearn.java.hello;

import java.util.Scanner;

public class AddWithForLoop {

	
	
	
	
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Number: ");	       
	        int input = scanner.nextInt();	        
	        int total = 0;	        
	        System.out.println(" ");
	        
	        for (int i = 1; i <= input; i++) {
	        	System.out.print(i + " ");
	            total += i;
	        }	        
	        System.out.println(" ");
	        System.out.println("The sum is " + total+ ".");
	    }

	}

