package com.practice.dataStructures.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class findDuplicates {
	public static void main(String[] args) {
		List<Integer> duplicateList = new ArrayList<Integer>(Arrays.asList(10,5,3,4,6,7,5,9));
		System.out.println(duplicateList);
		
		/*ArrayList<Integer> withoutDups = new ArrayList<Integer>();
		
		while(it.hasNext()){
			Integer dupInt = it.next();
			if(!withoutDups.contains(dupInt)){
				withoutDups.add(dupInt);
			}
		}
		System.out.println(withoutDups);*/
		
		ListIterator<Integer> it = duplicateList.listIterator();
		while(it.hasNext()){
			Integer next = it.next();
			if(duplicateList.contains(next))
				it.remove();
		}

		
		System.out.println(duplicateList);
	}
}
