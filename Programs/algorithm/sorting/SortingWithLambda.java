/*
 * Comparator vs Comparable:
 * http://www.javacodegeeks.com/2013/03/difference-between-comparator-and-comparable-in-java.html
 * http://stackoverflow.com/questions/4108604/java-comparable-vs-comparator
 * */

/*
 * forEach vs Iterator:
 * http://stackoverflow.com/questions/2113216/which-is-more-efficient-a-for-each-loop-or-an-iterator
 * http://stackoverflow.com/questions/18448671/how-to-avoid-concurrentmodificationexception-while-removing-elements-from-arr
 * Because:
 * 			The iterator works with remove() function at the same time while iterating through.
 * 			But the forEach doesnt. Throws the ConcurrentModificationException.*/

package com.algorithm.sorting;

import java.util.ArrayList;
import java.util.List;

public class SortingWithLambda {
	public static void main(String[] args) {
	    System.out.println("Sorting with natural order");
	    List<String> l1 = createList();
	    l1.sort(null);
	    l1.forEach(System.out::println);
	    
	    System.out.println("Sorting with a lamba expression for the comparison");
	    List<String> l2 = createList();
	    
	    //compare in Comparator is having two arguments compare(object o1, object o2); 
	    l2.sort((s1, s2) -> s2.compareToIgnoreCase(s1));  // sort ignoring case
	    //removeIf()
	    //computeIfAbsent() all are lambda conditioned functions.
	    
	    l2.forEach(System.out::println);	//why not iterator?
	    
	    System.out.println("Sorting with a method references");
	    List<String> l3 = createList();
	    l3.sort(String::compareToIgnoreCase);   
	    l3.forEach(System.out::println);
	         
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
