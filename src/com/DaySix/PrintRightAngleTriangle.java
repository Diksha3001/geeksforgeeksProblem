package com.DaySix;
//Solution.java
import java.util.*;
public class PrintRightAngleTriangle {
	

	    public static void solve() {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        // print right angle triangle of size n
	        for(int i=1;i<=n;i++)
	        {
	            for(int j=1;j<=i;j++)
	            {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	    }
	    public static void main(String args[])
	    {
	    	PrintRightAngleTriangle.solve();
	    }
	}
