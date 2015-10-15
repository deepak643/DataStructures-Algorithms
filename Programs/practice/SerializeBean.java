package com.practice.oops;
import java.io.Serializable;

public class SerializeBean implements Serializable{
	  private String firstName;
	  private String lastName;
	  // stupid example for transient
	  transient private Thread myThread;
	
	  public SerializeBean(String firstName, String lastName) {
	    this.firstName = firstName;
	    this.lastName = lastName;
	    this.myThread = new Thread();
	  }
	
	  public String getFirstName() {
	    return firstName;
	  }
	
	  public void setFirstName(String firstName) {
	    this.firstName = firstName;
	  }
	
	  public String getLastName() {
	    return lastName;
	  }
	
	  public void setLastName(String lastName) {
	    this.lastName = lastName;
	  }
	
	  @Override
	  public String toString() {
	    return "Person [firstName=" + firstName + ", lastName=" + lastName
	+ "]";
	  }
}