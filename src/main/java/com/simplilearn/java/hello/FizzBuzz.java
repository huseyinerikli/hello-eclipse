package com.simplilearn.java.hello;

import java.util.Scanner;

public class FizzBuzz {
	
	public static void fizzBuzz(int num) {
				
		for (int i = 0; i <= num; i++) {
			
			// if ((i %3 == 0)&&(i %5 ==0)){
			if (i % 15 == 0){
				System.out.println("FizzBuzz");
			}else if ((i % 3 == 0) && (i % 5 != 0)) {
				System.out.println("Fizz");
			} else if ((i % 3 != 0) && (i % 5 == 0)) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}				
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter an integer!: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		FizzBuzz res = new FizzBuzz();
		
		res.fizzBuzz(number);
		
	}
}
