package com.DayNine;
import java.util.*;
class ArrayLength{

	    public static int arrayLength(int[] arr) {
	        // code here
	        int count=0;
	      for(int i=0;i<=arr.length-1;i++) 
	      {
	          count++;
	      }
	      return count;
	    }
	}

	class LengthOfArray
	{
	    public static void main(String args[])
	    {
	       int arr[]=new int[]{1,2,3,4,5,6,8};
	       System.out.println(ArrayLength.arrayLength(arr));
	        
	    }
	}

