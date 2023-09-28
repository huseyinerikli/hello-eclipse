package com.simplilearn.java.hello;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Buffer {

	public static void main(String[] args) throws NumberFormatException, IOException {
//     
//    	System.out.print("enter an int: ");
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();		
//		for (int i = 1; i <=10; i++) {
//			System.out.println(N + " X " + i + " = " + (N*i));	

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter an integer: ");
		int N = Integer.parseInt(bufferedReader.readLine().trim());

		for (int i = 1; i <= 10; i++) {
			System.out.println(N + " X " + i + " = " + (N * i));
		}

		bufferedReader.close();
	}

}
