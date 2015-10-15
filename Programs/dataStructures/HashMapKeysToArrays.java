package com.practice.dataStructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.ListIterator;

public class HashMapKeysToArrays {
  public static void main(String[] args) {
	  HashMap<String, String> map = new HashMap<String, String>();
	  fillData(map);
	  
	  String[] keys = keysAsArray(map);
	  for(String key : keys){
		  System.out.println(key);
	  }
	  
	  List<String> list = (keysAsList(map));
	  for(ListIterator<String> ite = list.listIterator(); ite.hasNext();){
		  System.out.println(ite.next());
	  }
	  
  }

  private static void fillData(Map<String, String> map) {
    map.put("Android", "Mobile");
    map.put("Eclipse IDE", "Java");
    map.put("Eclipse RCP", "Java");
    map.put("Git", "Version control system");
    
  }

  private static String[] keysAsArray(Map<String, String> map) {
	return map.keySet().toArray(new String[map.keySet().size()]);
  }

  // assumes the key is of type String
  private static List<String> keysAsList(Map<String, String> map) {
	List<String> list = new ArrayList<String>(map.keySet());
	return list;
  }

} 
