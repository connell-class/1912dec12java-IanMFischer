package com.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream {
public static void main(String[] args) {
	String filename = "charFile.txt";
	writeCharStream(filename);
	readCharStream(filename);
}
static void writeCharStream (String filename) {
	try(FileWriter writer = new FileWriter(filename, true)){
		for (int i = 60; i < 72; i++) {
			writer.write(i);
			
		}
	} catch (IOException e) {
		e.printStackTrace();
	}
}
static void readCharStream(String filename) {
	try(FileReader is = new FileReader(filename)){
		int i;
		while ((i=is.read()) != -1){
			System.out.println((char)i);
		}
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}
