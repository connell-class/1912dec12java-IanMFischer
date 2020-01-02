package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class ByteStream {
	public static void main(String[] args) {
		String filename = "bytefile.txt";
		//writeByteStream(filename);
		readByteStream(filename);
	}
	static void writeByteStream(String filename) 
	{
		try(FileOutputStream os = new FileOutputStream(filename)) {
			os.write(73);
			os.write(43);
			os.write(12);
			os.write(100);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	static void readByteStream(String filename) {
		try(InputStream is = new FileInputStream(filename)){
			int i;
			while ((i=is.read()) != -1){
				System.out.println(i+" ");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}