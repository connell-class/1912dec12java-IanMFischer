package com.surprise;
/*
 * Strings are immutable
 * StringBuilder is a class that contains mutable strings
 * 
 * stringBuffer is a lot like StringBuilder, however StringBuffer
 * 	is synchronized. this makes it slower, but thread safe.
 * Get to know the methods of each class they can be deceptive.
 * 
 */
public class BufferTheStringSlayer {
	public static void main(String[] args) {
		String str = "What do we do now?";
		System.out.println(str);
		StringBuilder sb = new StringBuilder("We do this");
		System.out.println(sb);
		str.concat("The cat is back");
		sb.append("no cat no");
		System.out.println(str);
		System.out.println(sb);
		
		StringBuffer sb1 = new StringBuffer(str);
		sb1.append(1000);
		sb1.insert(5, "this is stringy, bow to stringy");
		System.out.println(sb1);
	}
}

