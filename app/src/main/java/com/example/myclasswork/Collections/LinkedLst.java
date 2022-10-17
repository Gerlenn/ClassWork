package com.example.myclasswork.Collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedLst {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add(1, "hi");
        LinkedList linkedList = new LinkedList<>();
        linkedList.add("bye");
        linkedList.add("Hi");
//        System.out.println(arrayList.indexOf("world"));
//        arrayList.clear();
//        arrayList.remove("hello");
        System.out.println(arrayList.indexOf("bye"));
        System.out.println(arrayList.indexOf("bye"));
        System.out.println(linkedList);
    }
}
