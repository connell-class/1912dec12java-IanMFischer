package com.day1.covariance;
/*
 * there are rules to the different ways we can override a method
 * 		Overriding details with a child class inheriting a method from the parent
 * 		and giving it a different implementation. Remember overriding v. overloading
 * 		and overriding v. shadowing.
 *
 * The three rules to method overriding are:
 * 		1. The access to the method can be more accessible, but not more restrictive.
 * 		2. the return type must be co-variant. it must be a child type of the original for example the co-variant type of class A would be class B when class B extends class A. This is of the 'is-a' relationship to class A.
 * 		3. The throws declaration cannot add to the potentially thrown exceptions. It can throw less, the same or none at all.
 * 		note: co-variance refers to the return type of the method, however, you will hear the entire topic referred to as co-variance.
 * 
 */
public class CoChild extends CoParent
{
//@Override CoParent method1(int x, Strings){return null;} //this is Overloading
//@Override CoParent method1(int x){return new CoParent();} //this is overriding
//@Override protected CoParent method1 (int x){return null;} // good
//@Override private   CoParent method1 (int x){return null;} // bad
//@Override CoChild method1 (int x){return null;} //good
//// the last rule deals with exceptions. the child must have, in its throws declaration, either the same or less than what the parent has in theirs.
//@Override CoParent method1(int x) throws Exception {return null;} // good
}

