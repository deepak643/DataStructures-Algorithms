package com.practice.dataStructures;

import java.io.*;
import java.util.*;

public class MyHashtable<K, V> {        
    String key, value;
    
    public MyHashtable(){
    	
    }
    
    public MyHashtable(K key, V value){
    	this.key = (String) key;
    	this.value = (String) value;
    }
    
    int size = 128;
    int hashOfKey;
	MyHashtable[] data;
    
    public void put(K key, V value) {
    	synchronized(this){
	    	if((key==null || key=="") && (value==null || value=="")){
	    		System.out.println("Key and Value could not be null/none");
	    		return;
	    	}
			hashOfKey = key.hashCode() % size;
			data[hashOfKey] = new MyHashtable(key, value);
    	}
	}

    public V get(K key) {
    	if(data[key.hashCode()] != null){
    		return (V) data[key.hashCode()].value;
    	}
        return null;
    }

    public static void main(String args[]) throws Exception {
        new TestHarness(new MyHashtable<String, String>()).run();
    }
    
    /**
     * A helper class that tests MyHashtable by feeding it puts and gets from STDIN.
     */
    public static class TestHarness implements Runnable {
        final MyHashtable<String, String> hashtable;

        public TestHarness(MyHashtable<String, String> hashtable) {
            this.hashtable = hashtable;
        }

        public void run() {
			Scanner scanner = new Scanner(System.in);
            while (scanner.hasNext()) {
                String k = scanner.next();
                String v = null;
                if (k.contains("=")) {
                    String[] split = k.split("\\=");
                    k = split[0];
                    v = split[1];
                }
                if (v == null) {
                    System.out.println(hashtable.get(k));
                } else {
                    hashtable.put(k, v);
                    String returnValue = hashtable.get("1");
                    System.out.println(returnValue);
                }
            }
        }
    }
}