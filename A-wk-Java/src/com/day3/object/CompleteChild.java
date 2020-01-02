package com.day3.object;

public class CompleteChild extends CompleteClass {

	private boolean worthless;
	
	public String name="yodel";

	public boolean isWorthless() {
		return worthless;
	}

	public void setWorthless(boolean worthless) {
		this.worthless = worthless;
	}

	public CompleteChild(int age, String name, double monies, boolean worthless) {
		super(age, name, monies);
		this.worthless = worthless;
	}

	public CompleteChild() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CompleteChild(int age, String name, double monies) {
		super(age, name, monies);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public String toString() {
		return "CompleteChild [worthless=" + worthless + ", isWorthless()=" + isWorthless() + ", hashCode()="
				+ hashCode() + ", getAge()=" + getAge() + ", getName()=" + getName() + ", getMonies()=" + getMonies()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (worthless ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompleteChild other = (CompleteChild) obj;
		if (worthless != other.worthless)
			return false;
		return true;
	}
	
	public String runOutThaDoor() {
		return "running into parent, then into door...fast";
	}
	
	protected void finalize() throws Throwable {
		System.out.println("i am being thrown away....weh");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
