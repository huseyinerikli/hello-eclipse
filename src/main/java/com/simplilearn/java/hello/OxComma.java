package com.simplilearn.java.hello;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OxComma {

	public  String printOxComma(List<String> list) {

		int size = list.size();
		if (list.isEmpty()) {
			return "";
			// System.out.println("");
		} else if (size == 1) {
			return list.get(0);
		} else if (size == 2) {
			return list.get(0) + " and " + list.get(1);

		} else {
			StringBuilder st = new StringBuilder();
			for (int i = 0; i < size - 1; i++) {
				st.append(list.get(i)).append(", ");
				// System.out.print(list.append(s).append(", "));
			}
			st.append("and ").append(list.get(size - 1));
			return st.toString();
		}
	}

	public static void main(String[] args) {

		List<String> st = new ArrayList<String>();

		st.add("A");
		st.add("B");
		st.add("C");
		st.add("D");
		st.add("E");

		OxfordComma res = new OxfordComma();
		
		System.out.println("The list is: " + res.printOxComma(st));
//		String res = OxfordComma.printOxComma(st);
//		System.out.println("The list is: " + res);
	}

}
