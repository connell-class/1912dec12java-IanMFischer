package com.day2.designs;

public class DessertFactory {
public static Dessert getDessert(String dessertType)
{
	switch(dessertType.toLowerCase())
	{
	case "cake":
		return new Cake();
	case "cookie":
		return new Cookie();
	case "icecream":
	return new IceCream();
	default:
		throw new DessertNotFoundException(dessertType);
	}
}
}
