package com.DayTwelve;
import java.util.*;
public class ReverseString {

	    public static String reverseString(String s) {
	        // code here
	        String sample="";
	        for(int i=s.length()-1;i>=0;i--)
	        {
	            sample+=s.charAt(i);
	        }
	        return sample;
	    }
	    public static void main(String args[])
	    {
	        Scanner sc=new Scanner(System.in);
	        String str=sc.next();
	        System.out.println(ReverseString.reverseString(str));
	    }
	}

