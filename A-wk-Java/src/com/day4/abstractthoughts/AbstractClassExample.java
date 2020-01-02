package com.day4.abstractthoughts;


/*
 * abstract methods are like thoughts
 * 
 * 
 * If you're wondering whether to use an abstract class or an interface, ask yourself "Am I defining the entire base
 * structure for the series of classes (abstract class) or am I simply requiring a series of classes to have some additional
 *  functionality(Interface).
 *  An Interface is a contract; it forces an implemnting class to implent its methods.
 *  An abstract class is the sam as a normal class with a few key differences:
 *  the ability to have abstract methods,
 *  All methods inside an interface arfe implicitly public and abstract.
 *  	abstract vs. concrete
 *  abstract has now implementation, concrete does.
 *  differences in interfaces and abstract classes
 *  		*	Interface				Abstract Class
 *  		*	---------				--------------
 *  methods:	abstract					abstract and concrete
 *  use:		implements					extends
 *				(extends for
 *		 		other interfaces)
 *	modifiers >>>>>
 *methods: 		public abstract				none
 *variables:	public static final			none
 *constructors: none						yes constructor
 *
 *__________________________________________________________________________________________
 *
 *why would we use one over the other?
 *	PRO AC: is the base of your class hierarchy.
 *	PRO I: Implement many interfaces, instead of using your one slot for extending a class
 *	PRO I: Able to create a level of Abstraction
 *	PRO I: are much smaller, not a lot to load compared to classes;
 *	PRO I: easier to come in, read, and understand the code
 *	PRO AC: Can have concrete methods.

 */
import java.io.Serializable;

@SuppressWarnings("serial")
public abstract class AbstractClassExample implements InterfaceExample, Serializable {
	int x;
	public void paint() {
		System.out.println("leave me alone I'm painting");
	}
	public abstract void print();
	AbstractClassExample(){
		super();
		System.out.println("this is the end of me");
	}
}

//abstract class can inherit from a concrete class
//abstract class is the base of the hierarchy
/*
 * concrete cannot have abstract methods
 * abstract class can extend a concrete class
 * 
 * 
 * Java DOES NOT support multiple inheritance
 * 
 * interface is like a contract with the concrete class where you need to provide an implementation for each method. 
 * rule of 30
 * 
 * polymorphic parameters...?
 * 
 * 
 */
