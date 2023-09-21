package com.simplilearn.java.hello;

	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.List;

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
	        int[] arr = {1, 2, 3, 4, 5};
	        Arrays.sort(arr);
	        List<List<Integer>> subsets = findSubsets(arr);
	        
	        System.out.println("Subset A: " + subsets.get(0));
	        System.out.println("Subset B: " + subsets.get(1));
	    }
	}
