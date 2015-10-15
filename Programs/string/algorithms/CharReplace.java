package com.string.algorithms;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

public class CharReplace {

	public static void main(String[] args) {
		replace("deepak", 'a');
	}
	
	public static String replace(String str, char ch){
		StringBuilder s = new StringBuilder(str.length());
		CharacterIterator it = new StringCharacterIterator(str);
		for(char c = it.first(); c!=CharacterIterator.DONE; c=it.next()){
			if(c==ch){
				c='o';
			}
			s.append(c);
		}
		System.out.println(s.charAt(5));
		System.out.println(s);
		return null;
	}

}