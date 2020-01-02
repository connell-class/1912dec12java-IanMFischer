package com.day1.generics;

import java.util.List;

public class GenericsExample<T> {
	//instance variable of the generic type
	T myvar;
	List<T> list;
	List<Integer> ints;
	//void method that takes in the generic type as a parameter
	public void mmyobj(T t) 
	{
		System.out.println(t);
		list.add(t);
	}
	//old way before generics
	public void addInt (Object o) 
	{
		if (o instanceof Integer)
		{
			ints.add((Integer)o);
		}
		else {
			throw new IllegalArgumentException();

		}
	}
	//method that returns the generic type
	public <T> T retObj(T t)
	{
		String clas = t.getClass().getSimpleName();
		switch(clas) 
		{
		case "Integer":
			((Integer)t).parseInt("234");
		}
		return t;

	}
}

