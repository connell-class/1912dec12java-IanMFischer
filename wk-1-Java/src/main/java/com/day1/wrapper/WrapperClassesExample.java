package com.day1.wrapper;
/*
 * Primitive Data types
 * int, float, short, long, boolean, char, long, byte, double
 * 
 * We have object representations  of these datatypes
 * 	ththe name of the class is just the datatype spelled out with Title Case
 * int Integer
 * char Character
 * short Short
 * double Double
 * long Long
 * float Float
 * boolean Boolean
 * byte Byte
 * 
 * these classes hold the prminitive datatypes, but also give us extra methods
 * to work with them.
 * 
 * When we convert from an object of a wrapper class to the primitive, this is
 * known as unboxing. It unboxes the primitive.
 * when we convert from primitive to a wrapper object, this is known as auto-boxing. it boxes the prmiitive.
 * 
 */

import java.util.ArrayList;
import java.util.List;

public class WrapperClassesExample {
public static void main(String[] args) {
	Integer i = new Integer(689);
	System.out.println(i);
	System.out.println(Character.MAX_VALUE);
	int x = i; //unboxing
	Integer i1 = x; //autoboxing
	
	
	//holding multiple primitives
	int[] r = {1,2,3,4};
	char[] c = {'c','f'};
	List<Integer>list = new ArrayList<>();
	
}
}
