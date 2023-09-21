package com.simplilearn.java.hello;
import java.util.Arrays;
import java.util.Scanner;

public class Sets {		
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number "
        		+ "of elements of the array: ");
        Scanner sc= new Scanner(System.in);
        
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

	}


