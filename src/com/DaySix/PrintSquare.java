package com.DaySix;
import java.util.*;
public class PrintSquare {
	
	    public static void solve() {
	        // Your Code Here
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        for(int i=1;i<=n;i++)
	        {
	            for(int j=1;j<=n;j++)
	            {
	                if(i==1||j==1||j==n||i==n)
	                {
	                    System.out.print("* ");
	                }
	                else
	                {
	                    System.out.print("  ");
	                }
	             
	            }
	            System.out.println();
	        }
	    }
	    
	    public static void main(String args[])
	    {
	    	PrintSquare.solve();
	    }
	}