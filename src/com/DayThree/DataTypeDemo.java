package com.DayThree;

public class DataTypeDemo {

	    // Function to do operations with different data types
	    static void dataTypes(int a, float b, double c, long l, byte d) {

	        double p; // c/b
	        double q; // b/a
	        double r; // c/a
	        double m; // r+l
	        int s;    // a/d
	        
	        p=c/b;
	        q=b/a;
	        r=c/a;
	        m=r+l;
	        s=(int)(a/d);

	        // Printing all the results
	        System.out.println(p + " " + q + " " + r + " " + m + " " + s);
	    }
	    
	    public static void main(String args[])
	    {
	    	DataTypeDemo.dataTypes(1,2.3f,3,5l,(byte)127);
	    }
	}
