package com.day4.abstractthoughts;
import java.io.Serializable;
public class ConcreteExample extends AbstractClassExample implements Paintable, Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 4973880688322675319L;
/*
 * 
 */
	
	
	
	
/*
 * 
 * 	If you're wondering whether to use an abstract class or an
 * 		interface, ask you'reself "am I defining the entire base 
 * 		structure for the series of classes (abstract class) or am
 * 		I simply requiring a series of classes to have some additional
 * 		functionality (Interface).
 * 
 * An Interface is a contract; it forces any implementing classes to
 * 		implement its methods.
 * 
 * An abstract class is the same as a normal class with a few key differences:
 * 		the ability to have abstract methods,
 * 
 * all methods inside an interface are implicitly public and abstract.
 * 
 * 		abstract vs concrete
 * 		abstract has no implementation, concrete does.
 * 
 * 
 * differences in interfaces and abstract classes
 * 		Interface							Abstract Class
 * 		---------							--------------
 * methods:		abstract							abstract and concrete
 * use:			implements							extends
 * 				(extends keyword for 
 * 				extending other interfaces)
 * modifiers->----------------------------------------------------	
 * methods:		public abstract						none
 * variables:	public static final					none
 * constructors:	none							yes constructor
 * 
 * ---------------------------------------------------------------
 * 
 * why would we use one over the other?
 * 		PRO AC:	is the base of your class hierarchy.
 * 
 * 		PRO I:	implement many interfaces, instead of using 
 * 					your one slot for extending a class
 * 
 * 		pro I:	able to create a level of abstraction.
 * 
 * 		PRO I:	smaller in size, not a lot to load compared to classes.
 * 
 * 		PRO I: 	easier to come in, and read and understand another devs code
 * 
 * 		PRO AC:	can have concrete methods.
 * 
 * 		Interfaces can only have abstract methods...unless
 * 			they are static...or
 * 			the are default
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 



 */

@Override
public void print() 
{
	// TODO Auto-generated method stub
}
@Override
public void paint1() 
{
	// TODO Auto-generated method stub
}
//@Override
//public void paint2() 
//{
//		// TODO Auto-generated method stub
//}
//@Override
//public void paint3() 
//{
//// TODO Auto-generated method stub
//}
@Override
public void paint4()
{
	System.out.println("this is the fix");
}
}