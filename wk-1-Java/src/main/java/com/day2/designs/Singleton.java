package com.day2.designs;

public class Singleton {
public static final Singleton instance = new Singleton();
if(instance == null) {
	instance = new Singleton();
	
}
}
}
