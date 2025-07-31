package com.DayEleven;
import java.util.*;
//User function Template for Java	
	// Complete the function
	// str: input string
public class CountWords {
	
	    public static int countWords(String str) {
	        // find and return the number of words
	        // present in the string
	        String res[]=str.trim().split("\\s+");
	        int res1=res.length;
	        return res1;
	    }
	    
	    public static void main(String args[])
	    {
	        Scanner sc=new Scanner(System.in);
	        String str=sc.nextLine();
	        int result=CountWords.countWords(str);
	        System.out.println(result);
	    }
	}
