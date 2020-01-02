package com.day2.designs;

public class DessertNotFoundException extends RuntimeException {
	public DessertNotFoundException()
	{
		super("desert was not found");
	}
public DessertNotFoundException(String message)
{
	super("dessert not found "+message);
}
}
