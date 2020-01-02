package com.day3.object;

public class NewClass {
private int var1 = 1;
private int var2 = 2;
private int var3 = 3;

	public NewClass() {
	super();
}
public NewClass(int var1, int var2, int var3) {
	super();
	this.var1 = var1;
	this.var2 = var2;
	this.var3 = var3;
}
	@Override
public String toString() {
	return "NewClass [var1=" + var1 + ", var2=" + var2 + ", var3=" + var3 + "]";
}

	public int getVar1() {
	return var1;
}

public void setVar1(int var1) {
	this.var1 = var1;
}

public int getVar2() {
	return var2;
}

public void setVar2(int var2) {
	this.var2 = var2;
}

public int getVar3() {
	return var3;
}

public void setVar3(int var3) {
	this.var3 = var3;
}

	public static void main(String[] args) {
	
}
}
