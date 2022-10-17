package com.example.myclasswork.Collections;

import java.util.ArrayList;

public class Lesson10 {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("hello");
        arrayList.add("bye");
        arrayList.add("world");
//        System.out.println(arrayList.indexOf("world"));
//        arrayList.clear();
//        arrayList.remove("hello");
        System.out.println(arrayList.indexOf("bye"));
        arrayList.add(1, "hi");
        System.out.println(arrayList.indexOf("bye"));
    }
}