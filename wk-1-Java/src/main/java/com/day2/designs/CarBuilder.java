package com.day2.designs;

public class CarBuilder {
	private int vin;
	private String make;
	private String model;

	public static CarBuilder newInstance()
	{
		return new CarBuilder();
	}
	private CarBuilder() {}
	public int getVin() {
		return vin;
	}
	public void setVin(int vin) {
		this.vin = vin;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
}

