package com.day1.instationorder;

public class Child {
//static and instance blocks
	{
		System.out.println("in the child");
	}
	public Child()
	{
		
	}
public static void main(String[] args) {
	Child child = new Child();
}
}
