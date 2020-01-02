package com.day2.access;

/*
 * Access Modifiers
 * 					own Class		package			children		everywhere else
 * 	public				X				X				X				X
 * 	protected			X				X				X				O
 *	default				X				X				O				O
 * 	private				X				O				O				O
 * 
 * 
 * 
 */




public class LightBulb {

	public int elements;
	protected String brand;
	boolean cool;
	private double watts;
	
	public LightBulb(int elements, String brand, boolean cool, double watts){
		this.elements=elements;
		this.brand=brand;
		this.cool=cool;
		this.setWatts(watts);
	}

	public double getWatts() {
		return watts;
	}

	public void setWatts(double watts) {
		this.watts = watts;
	}
	
	
	
	
	
	
	
}
