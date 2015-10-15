package com.practice.dataStructures.algorithms;
/*
 * currency={1,5,10,20,25}
 * amount = 37
 * */

public class coinChange {
	static int k = 0;
	/*Could have used ArrayList. Please increase the array if you need to store more currency change (eg., thirty 1's for amount:30).*/
	static int[] change = new int[10];
	public static void main(String[] args) {
		int[] currency = {1,5,10,20,25};
		int amount = 23; /*Change the amount as required to see the proper change is available.*/
		coinChanger(currency, amount, change);
		for(int coins : change){
			System.out.println(coins);
		}
	}
	
	public static int coinChanger(int[] coins, int amount, int[] change){
		int changeSum = 0;
		int nearHighest = nearHighestCoin(coins, amount);
		
		if(nearHighest == 0)
			System.out.println("No proper change available");
		if(nearHighest == amount){	//20==23?
			return nearHighest;
		}else{
			if(k==0)
				change[k] = nearHighest;
			changeSum = changeSum + nearHighest;	//0+20
			change[++k] = coinChanger(coins, (amount - changeSum), change); // coins, 3, change
		}
		
		return nearHighest;
	}
	
	public static int nearHighestCoin(int[] coins, int amount){
		int nearHighest = 0;
		int high = coins.length - 1;
		int low = 0;
		
		int mid = low + (high-low)/2;
		
		if(amount >= coins[mid]){
			for(int i=mid; i<coins.length; i++){
				if(amount<coins[i]){
					nearHighest = coins[i-1];
					break;
				}
				if(amount == coins[i])
					nearHighest = coins[i];
				if(i==coins.length - 1)
					nearHighest = coins[coins.length -1];
			}
		}
		else{
			for(int i=mid-1; i>=0; i--){
				if(amount>coins[i]){
					nearHighest = coins[i];
					break;
				}
				if(i==0){
					nearHighest = coins[i];
				}
			}
		}
		return nearHighest;
	}
}