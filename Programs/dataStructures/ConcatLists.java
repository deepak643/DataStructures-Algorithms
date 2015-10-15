package com.practice.dataStructures;

import java.util.ArrayList;
import java.util.List;
 
public class ConcatLists {
 
	public static void main(String[] args) {
 
		List<String> listA = new ArrayList<String>();
		listA.add("A");
 
		List<String> listB = new ArrayList<String>();
		listB.add("B");
 
		List<String> listFinal = new ArrayList<String>();
		listFinal.addAll(listA);
		listFinal.addAll(listB);
 
		//same result
		//List<String> listFinal = new ArrayList<String>(listA);
		//listFinal.addAll(listB);
		
		//same result
		//List<String> listFinal = ListUtils.union(listA, listB);
		
		System.out.println("listA : " + listA);
		System.out.println("listB : " + listB);
		System.out.println("listFinal : " + listFinal);
 
	}
 
}