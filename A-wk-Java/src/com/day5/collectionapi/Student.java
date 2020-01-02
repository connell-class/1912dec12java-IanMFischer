package com.day5.collectionapi;

public class Student implements Comparable<Student>{

	private String name;
	private int gpa;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGpa() {
		return gpa;
	}

	public void setGpa(int gpa) {
		this.gpa = gpa;
	}

	public Student(String name, int gpa) {
		super();
		this.name = name;
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gpa=" + gpa + "]";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.gpa - o.gpa;
	}

}
