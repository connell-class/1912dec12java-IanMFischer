package com.day3.imports;

import static java.util.Arrays.sort;
import static java.util.Arrays.asList;
//import java.util.Arrays;

/*
 * you must import a class if it is not in the same package.
 * 		the import syntax looks like:
 * 			import [fully qualified name]
 * 
 * you can import a static method with a static import
 * 		import static [fully qualified name].[method]
 * 
 * when using one over the other, a normal import, you are
 * 		just bringing the entire class in, so you use [class].[method]
 * 		for static methods. when using a static import, you just reference
 * 		the method.
 * 

*/


public class AnotherArrayExample {

	public static void main(String[] args) {
		int[] myArr = {5,3,44,5,16,2,10};
		sort(myArr);
		System.out.println(asList(myArr)); //using a static import
		
//		boolean[] boo = {true, false, true};
//		java.util.Arrays.toString(boo);
//		System.out.println(java.util.Arrays.toString(myArr)); this is using the
								//fully qualified name
		
		
	}
}
