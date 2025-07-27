package com.DaySix;

public class Calculator {

	    public static void utility(int a, int b, int opr) {
	        // code here
	        if(opr==1)
	        {
	            int add=a+b;
	            System.out.print(String.valueOf(add));
	        }
	        else if(opr==2)
	        {
	            int sub=a-b;
	            System.out.print(String.valueOf(sub));
	        }
	        else if(opr==3)
	        {
	            int mul=a*b;
	            System.out.print(String.valueOf(mul));
	        }
	        else
	        {
	            System.out.print("Invalid Input");
	        }
	        
	    }
	    public static void main(String args[])
	    {
	        
	    	 Calculator.utility(1,0,1);
	    }
	}