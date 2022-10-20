package com.example.myclasswork;

import java.util.ArrayList;
import java.util.Iterator;

public class CallIterable {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("tree");
        arrayList.add("four");
        arrayList.add("five");


        Iterator iterator = arrayList.iterator();

//        while (iterator.hasNext()) {//перебор коллекции с помощью Iterator
//            System.out.print(iterator.next());
//        }

        int index = arrayList.indexOf("two");// удаление по индексу
        arrayList.remove(index);
        System.out.print(arrayList);
    }
}
