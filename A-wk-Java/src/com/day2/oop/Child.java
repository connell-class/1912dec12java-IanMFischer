package com.day2.oop;

public class Child extends Parent {

	//method overriding
	boolean spank() {
		return false;
	}
	
	//method overloading
	boolean spank(int num) {
		return num==3;
	}
}
