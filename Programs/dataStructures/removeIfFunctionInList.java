package com.practice.dataStructures;

import java.util.ArrayList;
import java.util.List;

public class removeIfFunctionInList {
	  public static void main(String[] args) {
	    System.out.println("Demonstration of removeIf");
	    System.out.println("-------------------------");
	    List<String> l1 = createList();
	    // remove all items which contains an "x"
	    l1.removeIf(s-> s.toLowerCase().contains("x"));
	    l1.forEach(s->System.out.println(s));
	    
	         
	  }
	  
	  private static List<String>  createList() {
	    List<String> list = new ArrayList<>();
	    list.add("iPhone");
	    list.add("Ubuntu");
	    list.add("Android");
	    list.add("Mac OS X");
	    return list;
	  }
}
