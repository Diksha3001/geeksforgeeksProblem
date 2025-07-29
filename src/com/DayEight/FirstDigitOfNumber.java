package com.DayEight;
import java.util.*;
public class FirstDigitOfNumber {

	    public static int firstDigit(int n) {
	        // code here
	        int no=0;
	        while(n>0)
	        {
	           no=n%10;
	           n/=10;
	        }
	        return no;
	    }
	}
	class DisplayFirstDigit
	{
	    public static void main(String args[])
	    {
	        Scanner sc=new Scanner(System.in);
	        System.out.println(FirstDigitOfNumber.firstDigit(sc.nextInt()));
	    }
	}
