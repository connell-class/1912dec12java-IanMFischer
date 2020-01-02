package com.serialization;

import java.util.ArrayList;
import java.util.List;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationExample 
{

	public static void main(String[] args) 
	{
		String filename = "object.txt";
		writeObject(filename, new Person("Sammy Laurence", 78, 55555554));
		List<Person> list = new ArrayList<>();
		list.add(new Person ("Bruce Wayne", 120, 654312376));
		writeObjectList(filename, list);
		list = readObjectList(filename);
		System.out.println(list);
		System.out.println(readObject("scannedHuman.txt"));
	}
	static void writeObject(String file, Object o)
	{
		try(ObjectOutputStream oos = new  ObjectOutputStream(new FileOutputStream(file)))
		{
			oos.writeObject(o);
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

	static Object readObject(String file)
	{
		try(ObjectInputStream is = new ObjectInputStream(new FileInputStream(file))){
			return is.readObject();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
			catch(ClassNotFoundException e) 
		{
				e.printStackTrace();
		}
			return null;




		}

		static void writeObjectList(String file, List<Person> o)
		{
			try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(file)))
			{
				os.writeObject(o);
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	
@SuppressWarnings("unchecked")
static List<Person> readObjectList(String file) {
	try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
		return (List<Person>)ois.readObject();
	}
	catch (Exception e) 
	{
		e.printStackTrace();
	}
	return null;
	}
}

