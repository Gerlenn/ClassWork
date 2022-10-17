package com.example.myclasswork.Collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SetCollection {
    public static void main(String[] args) {
        SortedSet sortedSet = new TreeSet();
        sortedSet.add("banana");
        sortedSet.add("apple");
        sortedSet.add("orange");
        sortedSet.add("banana");

        System.out.println(sortedSet);
    }
}
