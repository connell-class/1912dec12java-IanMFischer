package com.serialization;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = -4511552850522946213L;
private String name;
private int age;
private int ssn;
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
public int getSsn() {
	return ssn;
}
public void setSsn(int ssn) {
	this.ssn = ssn;
}
@Override
public String toString() {
	return "Person [name=" + name + ", age=" + age + ", ssn=" + ssn + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + age;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + ssn;
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
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (ssn != other.ssn)
		return false;
	return true;
}
public Person(String name, int age, int ssn) {
	super();
	this.name = name;
	this.age = age;
	this.ssn = ssn;
}
public Person() {
	super();
	// TODO Auto-generated constructor stub
}
public Person(Person P) {
	super();
	this.name = getName();
	this.age = getAge();
	this.ssn = getSsn();
}

}
