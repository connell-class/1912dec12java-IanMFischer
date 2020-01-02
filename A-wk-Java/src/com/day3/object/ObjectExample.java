package com.day3.object;

/*
 * Casting -> up and down
 * 
 * 		up casting is when we treat a child as a parent.
 * 
 * 		down casting is when we treat a parent as a child.
 * 
 * 		Overridden methods are impervious to casting.
 * 
 * 		variables can be cast into the light.
 * 			so it matters how it is casted.
 * 			if a parent is casted, you get the parents value,
 * 			if the child is casted, you get the childs value.
 * 
 * 
 * 	Garbage Collection 
 * 		The garbage collector will come on its own time.
 * 			it will clean up any unreferenced objects in the heap.
 * 			before the object is deleted forever, it will call
 * 			the finalize() method on the object.
 * 			You can suggest the garbage collector to come with
 * 			System.gc(), however it can never be forced.
 * 
*/

class ObjectExample {

	public static void main(String[] args) throws InterruptedException {
//		Object o = new Object();
//		System.out.println(o.equals(o));
//		System.out.println(o.toString());
//		ObjectExample oe = new ObjectExample();
//		System.out.println(oe);
//		System.out.println(o.hashCode());
//		System.out.println(oe.hashCode());
		
//		CompleteClass complete = new CompleteClass(16, "billy", 1000.2);
//		System.out.println(complete.runOutThaDoor());
		
		//this is upcasting
		CompleteClass complete = new CompleteChild();
		System.out.println(complete.runOutThaDoor());
		@SuppressWarnings("unused")
		Object o = complete;

		//		this is down casting
		CompleteChild cc = (CompleteChild)complete;
		
		System.out.println(((CompleteClass)cc).name);
		
		
		
		
//		new CompleteChild();
//		new CompleteChild();
//		new CompleteChild();
//		new CompleteChild();
//		cc=null;
//		complete=null;
//		Object o1 = new Object();
//		Object o2 = new Object();
//		Object o3 = o2;
//		o2 = null;
//		o1 = null;
		//we can suggest garbage collection
//		for(int x =0; x<40;x++) {
//			System.out.println("hello");
//		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	public String toString() {
		return "this is my strings";
	}
}
