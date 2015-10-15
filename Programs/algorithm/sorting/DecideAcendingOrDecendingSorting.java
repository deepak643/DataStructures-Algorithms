package com.algorithm.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DecideAcendingOrDecendingSorting {
  public static void main(String[] args) {
	    List<Integer> list = new ArrayList<Integer>();
	    list.add(5);
	    list.add(4);
	    list.add(3);
	    list.add(7);
	    list.add(2);
	    list.add(1);
	    Collections.sort(list, new CustomComparator());
	    //You can use Collections.reverse() here.
	    
	    for (Integer integer : list) {
	      System.out.println(integer);
	    }
	  }
}
