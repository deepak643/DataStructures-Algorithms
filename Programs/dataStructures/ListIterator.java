package com.practice.dataStructures;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//http://stackoverflow.com/questions/10977992/difference-between-iterator-and-listiterator
public class ListIterator{

    public static void main(String[] args) {
        
        Map<Integer, String> stockTable=new HashMap<Integer,String>();


        stockTable.put(2, "Two");
        stockTable.put(4, "Four");
        stockTable.put(3, "Three");
        stockTable.put(1, "One");

        Set<Entry<Integer, String>> stockSet = stockTable.entrySet();

        Iterator<Entry<Integer, String>> i = stockSet.iterator();
        System.out.println("Iterating over Hashtable in Java");
        
        //Iterator begins
        while(i.hasNext()){
        	
            Map.Entry<Integer,String> m = i.next();
            int key = m.getKey();
            String value=m.getValue();
            System.out.println("Key :"+key+"  value :"+value);
        }
        
        System.out.println("Iteration over Hashtable finished");
    }
}

/* Iterating through HASHMAP
 * 
 * public static void printMap(Map mp) {
    Iterator it = mp.entrySet().iterator();
    while (it.hasNext()) {
        Map.Entry pair = (Map.Entry)it.next();
        System.out.println(pair.getKey() + " = " + pair.getValue());
        it.remove(); // avoids a ConcurrentModificationException
    }
}*/