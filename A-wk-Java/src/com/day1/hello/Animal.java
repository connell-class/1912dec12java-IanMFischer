
//package must be the first thing in the java file
package com.day1.hello;

class Animal {

	public static void main(String[] args){
	//	System.out.println("hello animal");
	
	
	//primitive datatypes: int, short, char, double, long, float, byte, boolean
	//reference datatypes: Object
	//	what is a variable: a placeholder to hold a value
	//	how do we declare a variable?
	//		datatype variableName = value;
	int x = 3;
	char c = 'c';
	short s = 1;
	long l = 1;
	double d = 1.1;
	float f = (float)1.1;
	float f1 = 1.2f;
	boolean b = true;
	byte b1 = 1;
	System.out.println(c);
	System.out.println(s);
	System.out.println(l);
	System.out.println(d);
	System.out.println(f);
	System.out.println(f1);
	System.out.println(b);
	System.out.println(b1);
	
	//	boolean = 1 bit
	//	byte = 8 bits
	//	nibble = 4 bits
	//	short = 16 bit
	//	int = 32 bit
	//	long = 64 bit
	//	float = 32 bit
	//	double = 64 bit
	//	char = 16 bit
	
	//	conditional, control flow, flow control
		//if statement
		/*if(x == 5){
			System.out.println("this is the road we are on, no turning back now");
		}*/
		////////////////////////////////////////
		
		//if else statement
		/*if (x == 5){
			System.out.println("this is the road we are on, no turning back now");
		} else {
			System.out.println("ride or die");
		}
		
		x = 76; 	//to change the value of the variable after it is declared, 
					//omit the datatype, but keep the rest
			*/		
		////////////////////////////////////////
		
		//if else if else
		/*if (x == 5){
			System.out.println("this is the road we are on, no turning back now");
		} else if(x==3){
			System.out.println("ride or die");
		} else{
			System.out.println("wooooooooooohooooooooooooooo");
		}
		*/
		//switch
		x=5;
		/*switch(x){
			case 1:
				System.out.println("x is 1");
				break;
			case 2:{
				System.out.println("x is 2");
				break;
			}
			default:
				System.out.println("in the default");
			case 3:
				System.out.println("x is 3");
			
		}*/

		//	for loop
/*		for(int a = 0 ; a < 10; a = a+1){
			x=x+1;
		

System.out.println(x);
		}
*/
		//while loop
		
		/*while(x>20){
			System.out.println(x);
			x=x+1;
		}*/

		//do while loop
		
		do{
			System.out.println(x);
			x=x+1;
		}while(x<1);
		
		
		
	}
}
//this is a single line comment in java
/* this is a multi-line comment in java
	this is for other developers to know
	why I wrote what i did*/
