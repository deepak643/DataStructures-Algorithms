package com.algorithm;

public class ShuffleDeckOfCards {
	public static void main(String[] args) {
		String[] suit = {"S", "D", "C", "H"};
		String[] cards = {"A","2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		
		String[] deck = new String[52];
		
		for(int i=0; i<deck.length; i++){
			deck[i] = cards[i%13] + suit[i/13];
//			System.out.println(deck[i]);
		}
		
		for(int j = 0; j<deck.length; j++){
			int index = (int) (Math.random() * deck.length);
			
			String temp = deck[j];
			deck[j] = deck[index];
			deck[index] = temp;
		}
		
		for(String shuffle : deck){
			System.out.println(shuffle);
		}
	}
}
