package com.day2.scopes;
/*
 * What are the scopes of java
 * where the variable dies
 * 
 * class (static scope)
 * object (instance scope)
 * method
 * block (loop, local scope)
 * Note: 	You can access a static variable or method from inside an instance method
 * 			but not the other way around. 
 */
public class ScopeExample {
	static int radius; // class scope
	int perimeter;  //instance scope
	
	public static void main(String[] args) { //args: method scope
	
		if (true) {
		@SuppressWarnings("unused")
		int x = 6; //block scope (local)
		}
	ScopeExample.radius = 4;
		ScopeExample sc = new ScopeExample();
		sc.perimeter = 3;
//	System.out.println("shortcuts"); ctrl + / comment single line	
		/*
		 * comment out multiple lines
		 */
	System.out.println("ctrl+space is your best friend");	
	}

}
		
		

