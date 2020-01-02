package com.day1.reflection;


/*
 * Reflection API is used to monitor and change something about an object durring runtime.
 * example: we can change the accesibility of methods and variables durring runtime.
 * we can get a list of constructors and methods during runtime.
 * refleciton is all about bieng able to monitor and adjust things without needing to recomplile our code. This also allows us to change thigns about someone else's code during runtime.
 * immagine someone using Test as a member variable for their code.
 * we could create an instance and assign that member to it, betweent he time the develpoer writes it an actually uses it.
 */
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {

	public static void main(String[] args) throws Exception {
		// Creating an object whose properties are going to be checked
		Test t = new Test();
		// creating a class object from the object using the getClass method
		@SuppressWarnings("rawtypes")
		Class c = t.getClass();
		System.out.println("the name of the class is" + c.getSimpleName());
		System.out.println("the name of the class is" + c.getName());

		Constructor con = c.getConstructor();
		System.out.println("the number of parameters the constructor has is" + con.getParameterCount());
		//creates an object of the desired method by providing the method
		//name and the parameter class as arguments to the 
		//getDeclaredMethod()
		Method[] methods = c.getMethods();
		Method m1 = c.getDeclaredMethod("method2", int.class);
		m1.invoke(t,81);
		
		//Here we will grab the private method and change it to
		//where we can access it.
		
		Method m3 =c.getDeclaredMethod("method3");
		m3.setAccessible(true);
		m3.invoke(t);
		
		Field f = c.getDeclaredField("s");
		f.setAccessible(true);
		f.set(t, "ooga booga booga, because of courage");
		c.getDeclaredMethod("method1").invoke(t);
		
		String sam = new String("happy days");
		System.out.println(sam);
		Class string = sam.getClass();
		Field value = string.getDeclaredField("value");
		value.setAccessible(true);
		string.getDeclaredField("value");
		value.set(sam, new char[2]);
		
		
	}
}
/*
 * String sam = new String("happy days"); System.out.println(sam); Class string
 * = sam.getClass(); Field value = string.getDeclaredField("value");
 * value.setAccessible(true); char[] cups = { 'c', 'u', 'p', 's' };
 * value.set(sam, cups); //value.set(sam, new char[2]); System.out.println(sam);
 */