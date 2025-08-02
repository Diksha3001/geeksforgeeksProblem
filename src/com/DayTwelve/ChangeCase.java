package com.DayTwelve;
// User function Template for Java

// function to print the two string
// first string: the first character is changed
// to uppercase
// second string: complete string is changed
// to upper case.
// print both the string in new line.
import java.util.*;
public class ChangeCase {

	    public static void changeCase(String s) {
	        // code here
	        
	        System.out.println(s.substring(0,1).toUpperCase()+s.substring(1));
	        System.out.println(s.toUpperCase());
	    }
	    public static void main(String args[])
	    {
	        Scanner sc=new Scanner(System.in);
	        String str=sc.nextLine();
	        changeCase(str);
	    }
	}
