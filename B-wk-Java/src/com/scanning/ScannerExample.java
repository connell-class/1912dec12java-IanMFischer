package com.scanning;

import java.util.Scanner;

import com.serialization.Person;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		buildPerson(s);
	}
	static Person buildPerson(Scanner scan) {
		System.out.println("---WELCOME TO THE PERSON BUILDER INTERFACE");
		
		System.out.println("--PLEASE ENTER THE NAME OF YOUR PERSON");
		String name= scan.nextLine();
		System.out.println("THE NAME OF  YOUR PERSON IS: "+name);
		
		System.out.println("-- PLEASE ENTER THE AGE OF YOUR PERSON");
		int age = scan.nextInt();
		System.out.println("THE AGE OF YOUR PERSON IS: "+age);
		
		System.out.println("--PLEASE NTER THE SSN OF YOUR PERSON");
		int ssn = scan.nextInt();
		System.out.println("THE SSN OF YOUR PERSON IS: "+ssn);
		Person p = new Person(name, age, ssn);
		
		return  p;

	}
	
	
	
	
	
	static void trash() {
		Scanner scan = new Scanner(System.in);
		System.out.println("how many would you like?");
		int selected = scan.nextInt();
		switch(selected) {
		case 1: 
		System.out.println("you wanted one?? how dare you");
		break;
		case 2:
			System.out.println("two coming right up");
			break;
		case 3:
			System.out.println("you are so greedy");
			break;
			default: 
				System.out.println("does not compute");
			break;
		}
	scan.close();
	}

}
