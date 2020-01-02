package com.revature.main;

import java.util.Scanner;

public class Solution {

    // Complete the staircase function below.
    static void staircase(int n) 
    {
    	
    	for(int i=1;i<=n;i++)
    	  {
    	   for(int j=1;j<=n;j++)
    	    
    	   {
    	    if((i+j)>n)
    	    {
    	    System.out.print("#");
    	    }
    	    else
    	    {
    	     System.out.print(" ");
    	    }
    	    
    	   }
    	   System.out.println();
    	  }    	   
    	  }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	System.out.println("Enter one integer (1,2,3...100)");
    	int n = scanner.nextInt();
        
    	scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
if(n>0 & n<=100) {
        staircase(n);
        scanner.close();
}
else 
	System.out.println("Pick a number 1-100");
        
    }
}
