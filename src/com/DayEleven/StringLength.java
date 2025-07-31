package com.DayEleven;
import java.util.*;
//User function Template for Java
// Complete the function
// str: input string
public class StringLength {
	
	    public static int lengthString(String str) {
	        // find the length of string
	        int count=0;
	        for(int i=0;i<str.length();i++)
	        {
	            count++;
	        }
	        return count;
	    }
	    
	    public static void main(String args[])
	    {
	        Scanner sc=new Scanner(System.in);
	        String str=sc.nextLine();
	        System.out.println(StringLength.lengthString(str));
	    }
	}
