package com.day4.abstractthoughts;

public class Driver {
	 public static void main(String[] args) {
		ConcreteExample ce = new ConcreteExample();
		ce.print();
		ce.paint();
		ce.x=4;
		InterfaceExample.o.getClass();
		System.out.println(InterfaceExample.point());		
//		AbstractClassExample = new AbstractClassExample(); cannot instantiate
		ce.paint4();
	 }
}
/*
* NEVER INHERIT CONSTRCUTORS
*/