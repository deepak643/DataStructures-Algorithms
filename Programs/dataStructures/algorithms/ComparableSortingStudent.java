/*
 * Comparator vs Comparable:
 * http://www.javacodegeeks.com/2013/03/difference-between-comparator-and-comparable-in-java.html
 * http://stackoverflow.com/questions/4108604/java-comparable-vs-comparator*/

package com.practice.dataStructures.algorithms;

public abstract class ComparableSortingStudent implements Comparable {
    private String studentname;
    private int rollno;
    private int studentage;

    public ComparableSortingStudent(int rollno, String studentname, int studentage) {
        this.rollno = rollno;
        this.studentname = studentname;
        this.studentage = studentage;
    }

    public int compareTo(ComparableSortingStudent comparestu) {
        int compareage=((ComparableSortingStudent)comparestu).getStudentage();
        /* For Ascending order*/
        return this.studentage-compareage;
    }

    private int getStudentage() {
		// TODO Auto-generated method stub
		return studentage;
	}

	@Override
    public String toString() {
        return "[ rollno=" + rollno + ", name=" + studentname + ", age=" + studentage + "]";
    }

}