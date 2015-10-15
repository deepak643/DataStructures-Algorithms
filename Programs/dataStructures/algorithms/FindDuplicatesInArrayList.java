package com.practice.dataStructures.algorithms;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicatesInArrayList {
	public static void main(String[] args) {
		List<Integer> duplicate = new ArrayList<Integer>();
		duplicate.add(3);
		duplicate.add(5);
		duplicate.add(6);
		duplicate.add(23);
		duplicate.add(13);
		duplicate.add(10);
		duplicate.add(6);
		duplicate.add(2);
		duplicate.add(13);
		duplicate.add(3);
		
		System.out.println("Duplicate Array: " + duplicate);

/*		for(int i=0; i<duplicate.size(); i++){
			for(int j=0; j<duplicate.size(); j++){
				if(duplicate.get(j) == duplicate.get(i) && i!=j){
					duplicate.remove(j);
				}
			}
		}
		
		System.out.println("Original Array: " + duplicate);*/
		
		
		
	}
}
