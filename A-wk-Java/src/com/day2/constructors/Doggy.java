package com.day2.constructors;

public class Doggy extends Animal {
public Doggy()

//this("name"); don't do this
//implicit first line in every constructor ... super()
{
	super("rover");
	System.out.println("in the doggy...woof");
}
public Doggy(String name)
{
	this();//the first line in the constructor must be this() or super()
	System.out.println(name);
}
public static void main(String[] args) {
	Doggy dog = new Doggy("doggie");
}
}
//method overloading same name different parameters