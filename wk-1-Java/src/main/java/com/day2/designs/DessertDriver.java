package com.day2.designs;

public class DessertDriver {
public static void main(String[] args) {
	Dessert cookie = DessertFactory.getDessert("COOkie");
//	System.out.println(cookie.hashcode());
//	Dessert notFound - DessertFactory.getDessert(dessertType);
	DessertFactory df = null;
	Dessert iceC = df.getDessert("icecream");
	System.out.println(iceC);
}
}
