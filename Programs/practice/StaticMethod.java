package com.practice.oops;

class StaticMethod {
	 
	  public static void main(String[] args) {
	    display();  //calling without object
	    StaticMethod t = new StaticMethod();
	    t.show();  //calling using object
	  }
	 
	  static void display() {
	    System.out.println("Programming is amazing.");
	  }
	 
	  void show(){
	    System.out.println("Java is awesome.");
	  }
	}