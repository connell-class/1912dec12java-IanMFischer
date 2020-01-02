package com.example.models;

public class Person {
private String name;
private int age;
private int monies;
public Person() {
	super();
	// TODO Auto-generated constructor stub
}
public Person(String name, int age, int monies) {
	super();
	this.name = name;
	this.age = age;
	this.monies = monies;
}
@Override
public String toString() {
	return "Person [age=" + age + ", monies=" + monies + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + age;
	result = prime * result + monies;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Person other = (Person) obj;
	if (age != other.age)
		return false;
	if (monies != other.monies)
		return false;
	return true;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getMonies() {
	return monies;
}
public void setMonies(int monies) {
	this.monies = monies;
}
}
