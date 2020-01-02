package com.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedCharacterStream {
	public static void main(String[] args) {
		String file = "bufferedFile.txt";
		System.out.println(file);

	}
	static void writeCharStream(String filename)
	{
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(filename))){
			writer.write("Hello File\n");
			writer.write("I dunno \n");
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	static void readCharStream(String filename) 
	{
		try(BufferedReader br = new BufferedReader(new FileReader(filename)))
		{
			String line = "";
			while((line = br.readLine()) != null) 
			{
				System.out.println(line);
			}
		}
			catch(IOException e)
			{
			}
		}
	}