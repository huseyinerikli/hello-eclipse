package com.simplilearn.java.hello;
import java.util.Arrays;
import java.util.Scanner;
import org.w3c.dom.Node;
import java.util.*;

	class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int val) {
	        this.val = val;
	    }
	}
	public class BinaryNums {
	    public static int binaryToDecimal(ListNode head) {
	        int decimalValue = 0;
	        int position = 0;

	        while (head != null) {
	            decimalValue += head.val * Math.pow(2, position);
	            position++;
	            head = head.next;
	        }
	        return decimalValue;
	    }
	public static void main(String[] args) {		
		  ListNode head = new ListNode(0);
	        head.next = new ListNode(1);
	        head.next.next = new ListNode(0);
	        head.next.next.next = new ListNode(0);
	        head.next.next.next.next = new ListNode(1);
	        head.next.next.next.next.next = new ListNode(1);
	        int decimalValue = binaryToDecimal(head);
	        
	        System.out.println("Binary Value: [010011]");

	        System.out.println("Decimal Value: " + decimalValue); // Output: 5
	    }    
}