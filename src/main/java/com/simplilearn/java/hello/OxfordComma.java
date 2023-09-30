package com.simplilearn.java.hello;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OxfordComma {

	public String printOxComma(List<String> list) {

		int size = list.size();
		if (list.isEmpty()) {			
			return "";			
		} else if (size == 1) {
			return list.get(0);
		} else if (size == 2) {
			return list.get(0) + " and " + list.get(1);
		} else {
			StringBuilder st = new StringBuilder();
			for (int i = 0; i < size - 1; i++) {
				st.append(list.get(i)).append(", ");
			}
			st.append("and ").append(list.get(size - 1));
			return st.toString();
		}
	}

	public static void main(String[] args) {
		List<String> st = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);

		for (;;) {
			System.out.println("Enter a string (or type 'STOP' -case Senstv- for exit and display the list): ");
			String input = sc.nextLine();
			if (input.equals("STOP")) {
				System.out.print("The list is: ");
				break;
			}
			st.add(input);
		}
		
		OxfordComma res = new OxfordComma();
		
		 String result = res.printOxComma(st);
		
		 System.out.println(result);
		 //System.out.println(res.printOxComma(st));
		 

		sc.close();
	}
}
