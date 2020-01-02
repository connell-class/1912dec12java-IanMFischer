package com.day2.arrays;

/*
 * 	using an array in your parameters is also known as varargs. (variable arguments)
*/

public class MainExample {

//	public static void main(String[] args) {
//		System.out.println(args[0]);
//	}
//	public static void main(String[] bananas) {
//		System.out.println(bananas[0]);
//		
	//}
	
	public static void main(String... args) {
		System.out.println(args[0]);
	}
	
	void method1(int x, char c1, char c2, char c3) {
		//stuff with it
	}
	void method2(int x, char...c) {
		
	}
	public MainExample(String...butter) {
	}
	
	
	
	
	
	
	
	
	
	
}
