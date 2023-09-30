package com.simplilearn.java.hello;
import java.util.Scanner;

public class AddWithForLoop {

	public void addNumbers(int num) {
		int total = 0;
		 for (int i = 1; i <= num; i++) {
	        	System.out.print(i + " ");
	            total += i;
	        }	        
	        System.out.println(" ");
	        System.out.println("The sum is " + total+ ".");              
	}
	
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Number: ");	       
	        int input = scanner.nextInt();	     	        
	        System.out.println(" ");
	        
	        AddWithForLoop res = new AddWithForLoop();
	        res.addNumbers(input);        

	    }
	}

