package com.day2.designs;
/*
 * this is kjnown as Java Bean design pattern
 * 1. private members
 * 2. public getters and setters
 * 3. no arg constructor
 * 4. completely optional implements serializable
 */
public class JavaBean {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public JavaBean() {
		super();
	}
}
