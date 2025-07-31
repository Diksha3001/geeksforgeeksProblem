package com.DayTen;

public class LargestElementInArray {
	
	    public static int largest(int[] arr) {
	        // code here
	        int max=arr[0];
	        for(int i=0;i<arr.length;i++)
	        {
	        if(max<arr[i])
	        {
	            max=arr[i];
	        }

	        }
	        return max;
	    }
	    
	    public static void main(String args[])
	    {
	        int arr[]={12,89,3,76,100,7,7};
	        System.out.println(LargestElementInArray.largest(arr));
	    }
	}
