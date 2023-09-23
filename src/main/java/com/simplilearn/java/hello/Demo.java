package com.simplilearn.java.hello;

	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.List;
import java.util.Scanner;

	public class Demo {

	    public static List<List<Integer>> findSubsets(int[] arr) {
	        List<List<Integer>> result = new ArrayList<>();
	        Arrays.sort(arr); // Sort the array in ascending order

	        int totalSum = 0;
	        for (int num : arr) {
	            totalSum += num;
	        }

	        int currentSum = 0;
	        int i = arr.length - 1;

	        while (i >= 0 && currentSum <= totalSum / 2) {
	            currentSum += arr[i];
	            i--;
	        }

	        if (currentSum <= totalSum / 2) {
	            // If we couldn't find a subset with sum greater than totalSum / 2
	            return result; // Return an empty list
	        }

	        List<Integer> subsetA = new ArrayList<>();
	        List<Integer> subsetB = new ArrayList<>();

	        for (int j = 0; j <= i; j++) {
	            subsetA.add(arr[j]);
	        }

	        for (int k = arr.length - 1; k > i; k--) {
	            subsetB.add(arr[k]);
	        }

	        result.add(subsetA);
	        result.add(subsetB);

	        return result;
	    }

	    public static void main(String[] args) {

			Scanner scanner = new 
					Scanner(System.in);
			
			System.out.print("please enter your age: ");
			int age = scanner.nextInt();
			
			if (age < 0) {
				System.out.println("invalid age input. Age cannot be negative.");
				
			}else if (age < 16) {System.out.println("you cant drive.");
			
			} else if (age >= 16 && age <= 17) {System.out.println("you can drive nut not vote.");
			
			} else if (age >= 18 && age <=24) {System.out.println("you can vote but not rent a car");
			
			} else {
				System.out.println("you can do pretty much anything.");
						
				}
			
	    	
	    	
//			Scanner scanner = new Scanner(System.in);
//			
//			System.out.print("Enter an interger:" );
//				int number =
//						scanner.nextInt();
//				
//				scanner.close();
//				
//				for (int i = 0; i <= number; i++)
//				{System.out.println(i);
//				
//				}
			
//				
//	    	for (int i = 0; i < 10; i++)
//			{
//				System.out.println("Mr. mitchel is cool.");
//				
//			}
//	    	
//	        int[] arr = {1, 2, 3, 4, 5};
//	        Arrays.sort(arr);
//	        List<List<Integer>> subsets = findSubsets(arr);
//	        
//	        System.out.println("Subset A: " + subsets.get(0));
//	        System.out.println("Subset B: " + subsets.get(1));
	    }
	}
