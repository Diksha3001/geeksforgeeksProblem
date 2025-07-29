package com.DayEight;
import java.util.*;
public class FunctionWithReturnValue {

	    // code here
	    public static int returnValueFunction(int n)
	    {
	        int doubleNo=n+n;
	        return doubleNo;
	    }
	}
	class CallFunction
	{
	    public static void main(String args[])
	    {
	       Scanner sc=new Scanner(System.in); 
	       System.out.println(FunctionWithReturnValue.returnValueFunction(sc.nextInt()));
	    }
	}
