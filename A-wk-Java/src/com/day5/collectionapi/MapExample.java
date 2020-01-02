package com.day5.collectionapi;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		Map<String, String> myMap = new HashMap<>();
		myMap.put("fafiu4'larjhafj", "$");
		myMap.put("3sjidnfiwqr", "#");
		myMap.put("2wknfi", "@");
		myMap.put("saifhiu1", "!");
		System.out.println(myMap);
		
		Map<String, String> trees = new TreeMap<>();
		trees.put("krusty", "krab");
		trees.put("stringy", null);
		trees.put("look at this", "crazy coder");
		trees.put("he laughs", "like mr krabs");
		trees.put("my", "man");
		System.out.println(trees);
	
	
	}
}
