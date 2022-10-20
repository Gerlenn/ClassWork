package com.example.myclasswork;

import java.util.HashMap;
import java.util.TreeMap;

public class CallMap {

    public static void main(String[] args) {

        HashMap hashMap = new HashMap<>();
        hashMap.put("Planet", "Saturn");
        hashMap.put("Earth", "Country");
        hashMap.put("Animal", "cat");
        hashMap.put("Earth", "Ocean");

        hashMap.remove("Earth");
        System.out.println(hashMap);
        System.out.println(hashMap.get("Animal"));
        System.out.println(hashMap.keySet());//список ключей
        System.out.println(hashMap.values());//список значений
        System.out.println(hashMap.containsValue("cat"));//проверяет есть ли такое значение
        System.out.println(hashMap.containsKey("cat"));//проверяет есть ли такой ключ
    }
}

class TrMap {

    public static void main(String[] args) {
        TreeMap hashMap = new TreeMap();
        hashMap.put("A", "C");
        hashMap.put("D", "A");
        hashMap.put("B", "D");
        hashMap.put("C", "B");

        System.out.println(hashMap);
    }
}
