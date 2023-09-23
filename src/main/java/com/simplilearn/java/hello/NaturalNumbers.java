package com.simplilearn.java.hello;
import java.util.Arrays;
import java.util.Scanner;

public class NaturalNumbers {

	public void printNatNumbers ( int numberOfNatNumbers) {
		             
    	int sum = 0;
	        for(int i=1;i<=numberOfNatNumbers;i++){
	        	System.out.println(i );
	        	sum += i;
	        } 
	        System.out.println("Total of the " +  numberOfNatNumbers + " natural numbers is : " + sum );
	}
	

	public static void main(String[] args) {
		
		NaturalNumbers nums = new NaturalNumbers();
		System.out.println(
				"Enter the number of natural numbers: ");
        Scanner sc= new Scanner(System.in);
        int numberOfNatNumbers=sc.nextInt();  
        
		 nums.printNatNumbers(numberOfNatNumbers);		           
		        
		}
	}

