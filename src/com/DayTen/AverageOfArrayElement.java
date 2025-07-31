package com.DayTen;

public class AverageOfArrayElement {
	
	    public static double posAverage(int[] arr) {
	        // Code here
	        double avg=0;
	        int count=0;
	        for(int i=0;i<arr.length;i++)
	        {
	           if(arr[i]>=0)
	           {
	               avg+=arr[i];
	               count++;
	           }
	        }
	        if(count>0)
	        {
	         return avg/count;
	        }
	        else
	        {
	        return Double.NaN;   
	        }
	    }
	    public static void main(String args[])
	    {
	        int arr[]={-10,-20,3,6,54};
	        System.out.println(AverageOfArrayElement.posAverage(arr));
	    }
	}

