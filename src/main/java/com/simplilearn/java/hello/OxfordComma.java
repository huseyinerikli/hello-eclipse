package com.simplilearn.java.hello;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OxfordComma {

	public static String printOxComma(List<String> list) {

		if (list.isEmpty()) {
			return "";
		} else if (list.size() == 1) {
			return list.get(0);
		} else if (list.size() >= 2) {
			for (int i = 0; i <= list.size(); i++) {
				return list.get(i) + ", ";
			}

		} else {
			return null;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a string: ");
//        String str = scanner.nextLine();
//        List <String> input = new ArrayList<String>();
//        input.add(str);       
		List<String> input = new ArrayList<String>();
		input.add("A");
		input.add("B");
		input.add("C");
		input.add("D");
		input.add("E");

		String st = OxfordComma.printOxComma(input);

		System.out.println(st);

	}

}
