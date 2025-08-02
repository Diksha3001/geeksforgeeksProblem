package com.DayTwelve;
import java.util.*;
public class Palindrome {

	    public static boolean isPalindrome(String s) {
	        // code here
	        String temp=s,s1="";
	        boolean flag=false;
	        for(int i=s.length()-1;i>=0;i--)
	        {
	            s1+=s.charAt(i);
	        }
	        return temp.equalsIgnoreCase(s1);
	    }
	    
	    public static void main(String args[])
	    {
	        Scanner sc=new Scanner(System.in);
	        String str=sc.next();
	        System.out.println(Palindrome.isPalindrome(str));
	    }
	}
