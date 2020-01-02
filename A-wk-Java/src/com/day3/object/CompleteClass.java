package com.day3.object;

public class CompleteClass {

	private int age;
	public String name="harry";
	private double monies;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMonies() {
		return monies;
	}

	public void setMonies(double monies) {
		this.monies = monies;
	}

	public CompleteClass(int age, String name, double monies) {
		super();
		this.age = age;
		this.name = name;
		this.monies = monies;
	}

	public CompleteClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return "CompleteClass [age=" + age + ", name=" + name + ", monies=" + monies + "]";
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		long temp;
		temp = Double.doubleToLongBits(monies);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompleteClass other = (CompleteClass) obj;
		if (age != other.age)
			return false;
		if (Double.doubleToLongBits(monies) != Double.doubleToLongBits(other.monies))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public String runOutThaDoor() {
		return "running into the door";
	}
	


	
	
	
	
	
}
