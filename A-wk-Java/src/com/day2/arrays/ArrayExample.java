package com.day2.arrays;

import java.util.Arrays;

public class ArrayExample {

	/*
	 * 	what is an array
	 * 		a data structure for holding values
	 * 		a series of data entries of the same type being held sequential in memory
	 * 
	 * 		array sizes are immutable
	 * 
	*/
	
	 int x;
	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0]=2;
//		System.out.println(arr[0]);
		
		String[] train = new String[7];
		train[0]="engine";
		train[6]="caboose";
		for(int x=1; x<6; x++) {
			train[x]="car";
		}
		Arrays.sort(train);
		System.out.println(Arrays.toString(train));
		
		String[] arr2 = {"me","am","hungy"};
		String [] arr3 = {"me","in","spaaaaace"};
		String arr4[] = {"whaaaa?","!!!"};
//		cool beans guys
		
		
		
		//Default values
		/*
		 * int = 0
		 * float = 0
		 * double = 0.0
		 * short = 0
		 * long = 0
		 * char = ''
		 * byte = 0
		 * boolean = false
		 * String = null
		 * Object = null
				When do variables hold these values?
				when it is static scope, instance scope, or it is in an array
		*/
		ArrayExample e = new ArrayExample();
		System.out.println(arr[3]);
		
		
		
		
		
		
		
		
		
	}
}
