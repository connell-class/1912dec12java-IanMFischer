package com.day5.collectionapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ListExample {

	public static void main(String[] args) {
		// this is an arraylist, simple to use and great to have
		ArrayList<Integer> al  =new ArrayList<Integer>();
		//this is generics, before 1.7 you had to add in this redundancy
		
		al.add(4);
		al.add(7);
		System.out.println(al);
		
		LinkedList<String> ll = new LinkedList<>();
		//this is without redundant types, this is 
		//		also called the diamond operator
		ll.add("%stringy");
		ll.add(" im here to ruin your day");
		ll.add("Shh its a secret");
		System.out.println(ll);
		
//		for(int x = 0; x<ll.size(); x++) {
//			System.out.println(ll.get(x));
//		}
		
		//Iterators
		Iterator<String> it = ll.listIterator();
		//listIterator provides methods for working with lists
		//		such as the previous method
		//Iterator in general is not able to the previous one
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		//this is called a for each loop or enhanced for loop
//		for(String s : ll) {
//			System.out.println(s);
//		}
		Collections.sort(ll);
		System.out.println(ll);
		
		
		
		
		
	}
}
