package com.day3.poly;

import java.io.IOException;

/*
 * 	polymorphism in java:
 * 		compile time polymorphism
 * 		overloading
 * 			change the method parameters
 * 			what ways can we do it
 * 				1. change the number of parameters
 * 				2. change the parameter type
 * 				3. change the order of the parameters
 * 
 * 		runtime polymorphism
 * 		overriding
 * 			child changes the implementation of its parents method
 * 			what ways can we do it?
 * 				1. change the access modifier
 * 					can only go more accessible, never less
 * 				2. can change the return type of the method
 * 					it must be a child of the parents return type
 * 				3. change throw the same or less exceptions than the 
 * 					parent method, but not more or different.
 * 				the rules for overriding a method is known as covariance
 * 					which gets its name from the return types, since
 * 					the return types must be covariant of each other.


*/



public class ParentPoly {

	protected Object method1() throws IOException
	{
		return 5;
	}

	protected int method1(String name) 
	{
		return name.length();
	}

	protected int method1(int n) 
	{
		return n;
	}

	protected int method1(int n, String name) 
	{
		return n+name.length();
	}

	protected int method1(String name, int n) 
	{
		return n;
	}
}











