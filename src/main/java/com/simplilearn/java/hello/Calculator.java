package com.simplilearn.java.hello;
import java.util.Arrays;
import java.util.Scanner;
public class Calculator {
	    public static int getSum(int arr[],int n){
	        int sum=0;
	        for(int i=0;i<n;i++){
	            sum+=arr[i];
	        }
	        return sum;
	    }
	    public static void getSubset(int arr[],int n){
	        int sum=getSum(arr,n);
	        int i;
	        int a=0;
	        for(i=n-1;i>=0;i--){
	            a+=arr[i];
	            if(a>sum/2){
	                break;
	            }
	        }
	        for(int j=i;j<n;j++){
	            System.out.println(arr[j]);
	        }
	    }	
	public static void main(String [] args) {		  
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number "
        		+ "of elements of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }          
        System.out.println("Output is:");
        Arrays.sort(arr);
        getSubset(arr,n);	 
        
	}
	
		
//		System.out.println("add is = " + add(5, 4 ));
//		System.out.println("Subtract is = " + subtract(5, 4));
//		System.out.println("Multiply is  = " + multiply(5, 4));
//		System.out.println("Divide is = " + divide(5, 4));
//		
//		System.out.println("roundToInt is = " + roundToInt(5.15751855));
//		System.out.println("The Number is EVEN; is it TRUE? = " + isEven(8));
//		System.out.println("The Number is ODD; is it TRUE? = " + isOdd(8));
//		System.out.println("Add three numbers = " + addThreeNums(5, 4, 2));
//		
//		System.out.println("Op XNOR = " + opXNOR(false, false));
//		System.out.println("Left is smaller; Is it true? : " + isLeftIsSmaller(5, 4));
//		System.out.println(" ");
//	
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter a year to check if it is a leap year!");
//		int year = input.nextInt();
//		
//		if (isLeapYear(year)) {
//		System.out.println( year + " is a leap year!");
//		}
//		else {
//			System.out.println(year + " is NOT a leap year!");
//		}	
				
	//}

	// add two integers and return an integer
	private static int add (int left, int right) {
		return left + right;
	}
	
	// subtract two integers and return an integer
	private static int subtract (int left, int right) {
		//return left - right;
		return add ( left, -1 * right ) ;
	}
	
	// multiply two integers and return an integer
	private static int multiply (int left, int right) {
		//return left * right;
		int accumulator = 0 ;
		for ( int i = 0 ; i < left ; i++ ) {
			for ( int j = 0 ; j < right ; j++ ) {
				accumulator++ ;
			}
		}
		return accumulator ;
	}
	
	// divide: take two integers and return double
	private static double divide (int left, int right) {
		return left / (double)right;
	}
	
	// round take a single double param, return int
	private static int roundToInt (double param) {
		//return (int)param ;
		//return (int) Math.round(param);
		return (int)(param + 0.5) ;

	}
		
	// isEven ( take a single integer ) and return true if if it is even
	private static boolean isEven (int left) {	
		return (left %2) == 0;	
		
	}
	
	// isOdd ( take a single integer ) and return true if if it is odd
	private static boolean isOdd (int left) {	
		//return (left %2) != 0;	
		return ! isEven ( left ) ;
	}
	
	// add three numbers
	private static int addThreeNums (int left, int right,int t) {
		return left + right + t;
	}
			
	// XNOR (takes two booleans and returns true if they are both true or both false
	private static boolean opXNOR (boolean left, boolean right) {
		
		//return ( ((left == true) && (right == true )) || ((left == false) && (right == false )) );
		 
		return left && right || ! left && ! right ;
//		 if (( ((left == true) && (right == true )) || ((left == false) && (right == false )) ) ){
//			 return true;
//		 }
//		return false;			
	}	
		
	// lessThan ( take two integers and return true if left is less than right)
	private static boolean isLeftIsSmaller(int left, int right) {	
		return left < right;		
	}	
	
	
	// isLeapYear take a year return true if it left is a leap year
	private static boolean isLeapYear(int year) {	
		return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);		
	}
	
}
