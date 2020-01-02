package com.day5.collectionapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionDriver {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("shawn", 3));
		students.add(new Student("flip", 1));
		students.add(new Student("chad", 4));
		students.add(new Student("another hire on jupiter", 15));
		//Student must implement Comparable
		//	Comparable gives the class the method CompareTo()
		//	Comparable gives a class a natural sorting order
		Collections.sort(students);
		System.out.println(students);
		Collections.sort(students, new StudentComparerByName());
		System.out.println(students);


		//moving from array to list and back
		Student[] s = new Student[3];
		List<Student> s2 = Arrays.asList(s);
		s = (Student[]) s2.toArray();

	}
}
