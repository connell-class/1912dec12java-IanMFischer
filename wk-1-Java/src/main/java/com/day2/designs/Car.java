package com.day2.designs;

public class Car {
private int vin;
private String manufacturer;
private String Model;
public Car(int vin, String manufacturer, String model) {
	super();
	this.vin = vin;
	this.manufacturer = manufacturer;
	Model = model;
}
public int getVin() {
	return vin;
}
public void setVin(int vin) {
	this.vin = vin;
}
public String getManufacturer() {
	return manufacturer;
}
public void setManufacturer(String manufacturer) {
	this.manufacturer = manufacturer;
}
public String getModel() {
	return Model;
}
public void setModel(String model) {
	Model = model;
}
@Override
public String toString() {
	return "Cars [vin=" + vin + ", manufacturer=" + manufacturer + ", Model=" + Model + "]";
}
}
