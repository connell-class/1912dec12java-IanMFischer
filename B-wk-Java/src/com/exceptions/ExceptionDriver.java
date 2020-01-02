package com.exceptions;

import java.io.IOException;
import java.io.StringWriter;

/*
 * Exceptions have a hierarchy
 * 				  Throwable --- class		checked
 * 				|			|
 * 	Exception checked		Error unchecked
 * 		|
 * 	RuntimeException Unchecked
 * 
 * 	printStackTrace() is available to provide a trace from the
 * 		stack off where the exception happened
 * 
 * 	Runtime Exceptions do not have to be handled
 * 
 * checked a throw-able must be handled.
 * 		we can handle the responsibility with a try catch block,
 * 		or we can duck it with a throws declaration
 * 
 */

class ExceptionDriver {
	public static void main(String[] args) {

//	ArrayIndexOutOfBoundsException ai = 
//			new ArrayIndexOutOfBoundsException();

//	ai.printStackTrace();

//	throw ai;

//		try {
//			thrower();
//		} catch (ArrayIndexOutOfBoundsException n) {
//			n.printStackTrace();
//		}
//		System.out.println("after the thing");

//		try {
//			voice();
//		} catch (MyCustomException e) {
//			e.printStackTrace();
//		}
//		voice();
		multipleCatch();
	}

	public static void thrower() {
		throw new NullPointerException("this is my thing");
	}
//	public static void thrower() {
//		try {
//			throw new Exception();
//		} catch (Exception e) {
//		}

	static void voice() {
		System.out.println("voice");
		try {
			hoarse();
		} catch (MyCustomException e) {
			e.printStackTrace();
		}
	}

	static void hoarse() throws MyCustomException {
		System.out.println("horse is hoarse");
		saddle();
	}

	static void saddle() throws MyCustomException {
		System.out.println("riding that same hoarse horse");
		guessWat();
	}

	static void guessWat() throws MyCustomException {
		throw new MyCustomException("this is the life yo");
	}

	static void multipleCatch() {
		try {
			throw new MyCustomException();
		} catch (MyCustomException m) {
			System.out.println("custom");
		} catch (Exception e) {
			System.out.println("exception");
		} catch (Throwable t) {
			System.out.println("throwable");
		}
	}
	static void Finally() {
		try {
//			System.exit(0);
			throw new NullPointerException();
		}  finally {
			System.out.println("finally");
		}
//		System.out.println("after all");
	}
	
	static void tryWithResources() {
//		StringWriter s = new StringWriter();
//		try {
//			s.append('d');
//		} finally {
//			s.close();
//		}
		try(StringWriter s = new StringWriter()){
			s.close();
			s.append('d');
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("this is the finally");
		}
	}
	
	


}
