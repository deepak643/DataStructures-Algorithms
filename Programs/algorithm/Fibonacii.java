package com.algorithm;

public class Fibonacii {

	public static void main(String[] args) {
		fib(8);
	}
	public static int fib(int n){
		if(n<=2)
			return 1;
		else{
			return fib(n-1) + fib(n-2);
		}		
	}

}
