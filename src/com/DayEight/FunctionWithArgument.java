package com.DayEight;
import java.util.*;
public class FunctionWithArgument {

	    // Write the complete argumentFunction below.
	    // The function should take two arguments a and b
	    // The function should return a+b
	    // code here
	    public static int argumentFunction(int a,int b)
	    {
	        int add=a+b;
	        return add;
	    }

	    public static void main(String args[])
	    {
	        Scanner sc=new Scanner(System.in);
	        int no1=sc.nextInt();
	        int no2=sc.nextInt();
	        
	        System.out.println(FunctionWithArgument.argumentFunction(no1,no2));
	    }
	}
