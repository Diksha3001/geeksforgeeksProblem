package com.DayTen;

public class CheckSortedArray {

	    public static boolean isSorted(int[] arr) {
	        // code here
	    
	       for(int i=0;i<arr.length-1;i++)
	       {
	           if(arr[i]>arr[i+1])
	           {
	               return false;
	           }
	       }
	       
	       return true;
	    }
	    
	    public static void main(String args[])
	    {
	        int arr[]={10,54,67,32};
	        System.out.println(isSorted(arr));
	        
	    }
	}