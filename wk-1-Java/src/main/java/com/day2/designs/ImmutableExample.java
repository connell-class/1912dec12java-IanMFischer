package com.day2.designs;
/*
 * to make a class immutable, the class needs to be final the variables need to be private (final is optional
 * 	getter methods
 * no setters
 * an all args constuctor
 */


public final class ImmutableExample {
	final String NAME;
	final int AGE;
	public String getNAME() {
		return NAME;
	}
	public int getAGE() {
		return AGE;
	}
}
//all args constructor