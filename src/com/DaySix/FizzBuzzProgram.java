package com.DaySix;

import java.util.Scanner;

public class FizzBuzzProgram {
	
	// User function Template for Java
	    public static void fizzBuzz(int number) {
	        // Write your code here.
	        
	        if(number%3==0&&number%5==0)
	        {
	            System.out.println("FizzBuzz");
	        }
	        else if(number%3==0)
	        {
	            System.out.println("Fizz");
	        }
	        else if(number%5==0)
	        {
	            System.out.println("Buzz");
	        }
	        else
	        {
	            System.out.println(number);
	        }
	        
	    }
	    
	    public static void main(String args[])
	    {
	        Scanner sc=new Scanner(System.in);
	        int no=sc.nextInt();
	        FizzBuzzProgram.fizzBuzz(no);
	    }
	}
