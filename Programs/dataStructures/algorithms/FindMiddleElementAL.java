package com.practice.dataStructures.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMiddleElementAL {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,9,5,6,7,8));
		int low = 0;
		int high = list.size()-1;
		System.out.println((high-low)/2);
		
		if(high%2==0){
			System.out.println(list.get(high/2));
		}else{
			System.out.println(list.get(high/2) + " " + list.get((high/2)+1));
		}
	}

}
