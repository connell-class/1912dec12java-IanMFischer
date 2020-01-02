package com.day2.oop;

import java.nio.file.OpenOption;

import com.day2.access.LightBulb;

public class OopNotes extends LightBulb{
	/*
	 * oop
	 * 	object oriented programming
	 * 		APIE
		 * 		Abstraction
		 * 		Polymorphism
		 * 		Inheritance
		 * 		Encapsulation
	 * 		Inheritance
	 * 			a way that a parents traits are passed down to the 
	 * 				child
	 * 			java is class based inheritance
	 * 		Polymorphism
	 * 			the way that behavior can take many forms. ex: a dog and a cat are both
	 * 				animals, but makeSound() provides different results
	 * 			java achieves polymorphism with method overloading and overriding
	 * 		Encapsulation
	 * 			preventing direct access
	 * 			java achieves this by using access modifiers.	
	 * 		Abstraction
	 * 			hiding details and implementation
	 * 			java achieves abstraction with interfaces and abstract classes
	 * 
	 */
//		access	return type	name(datatType parameters){}
	public static void main(String[] args) {
		Parent.paint("crimson...roll tide");

		Child c = new Child();
		c.age=5;// inheritance
		
		boolean b = c.spank(); //overriding...polymorphism
		boolean n = c.spank(4); //overloading
		System.out.println(b);
		
		OopNotes lb = new OopNotes(4, "ikea", true, 160.0);
		System.out.println(lb.elements); //4
		lb.elements=-400;
		lb.yellMyStuff();
		
	}

	public OopNotes(int elements, String brand, boolean cool, double watts) {
		super(elements, brand, cool, watts);
	}
	
	void yellMyStuff() {
		System.out.println(this.brand);
	}
	
}






