package com.day3.object;

public class StringExample {
	/*
	 * What is a String?
	 * 		A class that is implemented using an array of chars;
	 * 		A String is immutable;
	 * 
	 * What does immutable mean?
	 * 		cannot be changed
	 * 
	 * 
	 * 
		*/
	
	public static void main(String[] args) {
		
		String s = "this is a cat";
		String s1 = new String("this is a cat");
		String s2 = "this is a cat";
//		System.out.println(s.equals(s1));
		System.out.println(s2.toUpperCase());
		System.out.println(s2.charAt(3));
		System.out.println(s2.concat(",  stop shaking it!!!"));
		System.out.println(s2.length());
		System.out.println(s2.substring(2, 10));
		System.out.println(s+" "+s1);
	}
}
