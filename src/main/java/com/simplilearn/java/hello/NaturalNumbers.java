package com.simplilearn.java.hello;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NaturalNumbers {

	private void printNatNumbers(int numberOfNatNumbers) {
		int sum = 0;
		for (int i = 1; i <= numberOfNatNumbers; i++) {
			System.out.println(i);
			sum += i;
		}
		System.out.println("Total of the " + numberOfNatNumbers + " natural numbers is : " + sum);
	}

	public static void main(String[] args) {

		NaturalNumbers nums = new NaturalNumbers();

		System.out.println("Enter the number of natural numbers: ");
		Scanner sc = new Scanner(System.in);

		try {
			int numberOfNatNumbers = sc.nextInt();
			

			if (numberOfNatNumbers > 0) {
				System.out.println("First " + numberOfNatNumbers + " natural numbers are: ");
				nums.printNatNumbers(numberOfNatNumbers);
			} else {
				System.out.println("That is not a natural number; Please enter a positive integer");
			}

		} catch (InputMismatchException e) {
			System.out.println("Invalid input. Please enter a positive integer");
		} finally {
			sc.close();
		}

	}

}