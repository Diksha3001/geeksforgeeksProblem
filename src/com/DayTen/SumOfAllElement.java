package com.DayTen;

public class SumOfAllElement {

	    public static int arraySum(int[] arr) {
	        // code here
	        int sum=0;
	       for(int i=0;i<arr.length;i++) 
	       {
	           sum+=arr[i];
	       }
	       return sum;
	    }
	    public static void main(String args[])
	    {
	        int arr[]={1,2,3,4,5,6};
	        System.out.println(SumOfAllElement.arraySum(arr));
	    }
	}
