package com.day3.review;
/*
 * the main method is the entry point of any java application. When running the class,
 * the interpreter looks for this method. The parameters of this method is a String array,
 * also known as varargs or variable arguments.
 * The difference in parameters and arguments is that parameterare what is used in the
 * method declaration while arguments are what is puinto the method call.
 * when we call a method, we use it's name "main" with the parenthesis and any arguments
 * 	such as "main("hey", "there")". This is known as method invocation. we can call or invoke
 * a method.
 */


public class MainReview {
//you can change varargs
	/*
	 * syntax in the params, the param name and can add final to the method that is about all you can do differently with the main method.
	 */
	public final static void main(String... args) {
		System.out.println("here");
	}
}
