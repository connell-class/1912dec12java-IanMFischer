package com.day2.encapsulation;
/*
 * to properly encapsulate a class, use private variables with public Getter and setter methods.
 */
public class EncapExample {

	private int numbers;
	private String stringy;
	
	public int getnumbers() {
		return this.numbers;
	}
	public void setNumbers(int numbers) {
		if(numbers<=0) {
			return;
		}
		this.numbers = numbers;
		
	}
	public String getStringy() {
		return this.stringy;
	}
	public void setStringy(String stringy) {
	this.stringy = stringy;	
	}
}
