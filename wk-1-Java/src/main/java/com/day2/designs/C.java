package com.day2.designs;

public class C {
	private static C instance = null;
	private static C getInstance() {
		if(instance ==null)
		{
			instance = new C();
		}
		return instance;
	}
public static void main(String[] args) {
	getInstance();
}
}
