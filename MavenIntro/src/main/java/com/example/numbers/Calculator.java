package com.example.numbers;


public class Calculator {
	ConstantValues cv;
	
	public int sum(int i, int j) {
		return i+j;
	}
public Calculator(ConstantValues cv) {
		super();
		this.cv = cv;
	}
public int divide(int a, int b) {
	if(b == 0 ) {
		throw new ArithmeticException();
		
	}
	return a/b;
}
public double convertMileToFeet(int miles)	{
	return miles*cv.getMile();
	
}
}
