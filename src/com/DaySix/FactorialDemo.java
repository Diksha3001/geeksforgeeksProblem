package com.DaySix;

public class FactorialDemo {

	    public static int factorial(int n) {
	        int ans = 1;
	        if(n==0)
	        {
	            ans=1;
	        }
	        else{
	        for (int i = 1; i <= n; i++) {
	            ans *= i;
	        }
	        }
	        return ans;
	        
	    }
	    
	    public static void main(String args[])
	    {
	        int fact=factorial(5);
	        System.out.println(fact);
	    }
	}

	
