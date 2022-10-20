package com.example.myclasswork;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class arDeque {

    public static void main(String[] args) {

        ArrayDeque<String> arrayDeque = new ArrayDeque<String>();

        arrayDeque.addLast("python developer");
        arrayDeque.add("ios developer");
        arrayDeque.push("flutter developer");//добавление вперёд очереди, если он написан последним
        arrayDeque.addFirst("android developer");//тоже что и push

        System.out.println(arrayDeque);
//        System.out.println(arrayDeque.peekFirst());


        ArrayList arrayList = new ArrayList<>();
        arrayList.addAll(arrayDeque);//переносим значения из arrayDeque в ArrayList
        System.out.print(arrayList.get(2));
    }
}

class ArrayListToSet {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("python developer");
        arrayList.add("android developer");
        arrayList.add("android developer");
        arrayList.add("android developer");
        arrayList.add("Ios developer");

        Set<String> set = new TreeSet<String>();//переносим из ArrayList в Set и убираем дубликаты
        set.addAll(arrayList);
        System.out.println(set);
    }
}

class HaSet {

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        String dev = "developer";
        String sysAd = "sysadmin";
        String anim = "animator";
        hashSet.add(dev);
        hashSet.add(sysAd);
        hashSet.add(dev);
        hashSet.add(anim);

        System.out.println(hashSet);

    }
}


