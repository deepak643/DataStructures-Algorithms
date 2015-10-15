package com.practice.dataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class DictionaryHashMap {
	public static void main(String[] args) {
		HashMap<String, List<String>> dictionary = new HashMap<String, List<String>>();
		
		dictionary.put("asdf", (List<String>) Arrays.asList("3126136141", "7863762374"));
		dictionary.put("asddf", (List<String>) Arrays.asList("3126136140", "786376352374"));
		for(Entry<String, List<String>> entry : dictionary.entrySet()){
			System.out.println(entry);
		}
		
		
		ArrayList<Integer> array = new ArrayList<Integer>(Arrays.asList(1,2,3,45,5,6));
		System.out.println(array);
		/*for(String key : dictionary.keySet()){
			System.out.println(key + dictionary.get(key));
		}*/
	}

}
