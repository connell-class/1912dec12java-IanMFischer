package com.exceptions;

/*
 * we can create custom exceptions and Errors by
 * 		extending the classes. we can extend Throwable
 * 		and exception to create a custom checked exception
 * 		or extend RuntimeException to create an unchecked
 * 		exception.
 */
public class MyCustomException extends Exception {

	public MyCustomException() {
		super("custom exception");
	}
	public MyCustomException(String message) {
		super("our custom message is: "+message);
	}
	
}
