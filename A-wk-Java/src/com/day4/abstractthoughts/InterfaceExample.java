package com.day4.abstractthoughts;

public interface InterfaceExample {
	public static final int x=5;
	public abstract void paint1();
	Object o = new Object(); 
	static int point() 
	{
		return 4;
	}

	default void paint4() 
	{
		System.out.println("painting");
	}
}
// everything in an interface is implicitly public and abstract