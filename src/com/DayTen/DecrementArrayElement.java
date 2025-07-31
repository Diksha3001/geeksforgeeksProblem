package com.DayTen;

import java.util.Arrays;

public class DecrementArrayElement {
	
	    public static int[] decrementArrayElements(int[] arr) {
	        // Code here
	        int arr1[]=new int[arr.length];
	       for(int i=0;i<arr.length;i++)
	       {
	          arr1[i]=--arr[i]; 
	       }
	       return arr1;
	       
	    }
	    public static void main(String args[])
	    {
	        int arr[]={10,3,9,7};
	        System.out.println(Arrays.toString(decrementArrayElements(arr)));
	    }
	}