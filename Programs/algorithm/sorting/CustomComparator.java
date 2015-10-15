package com.algorithm.sorting;

import java.util.Comparator;

public class CustomComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return (o1>o2 ? -1 : (o1==o2 ? 0 : 1));
        //return o2 - o1 works
    }
}
