package com.example.myclasswork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Lesson11_1 {

    public static void main(String[] args) {

        ArrayList<Person> arrayList = new ArrayList<Person>();
        arrayList.add(new Person("Sasha", 18));
        arrayList.add(new Person("Dima", 10));
        arrayList.add(new Person("Olya", 21));
        arrayList.add(new Person("Sasha", 32));
        arrayList.add(new Person("Masha", 25));

        System.out.println(arrayList);

        Collections.sort(arrayList, new Comparator<Person>() {//сортируем по возрасту
            @Override
            public int compare(Person person, Person t1) {
                return Integer.valueOf(person.getAge()).compareTo(
                        Integer.valueOf(t1.getAge())
                );
            }
        });
        Collections.sort(arrayList, new Comparator<Person>() {//сортируем по имени
            @Override
            public int compare(Person person, Person t1) {
                return String.valueOf(person.getName()).compareTo(
                        String.valueOf(t1.getName())
                );
            }
        });

        for (Person person: arrayList){
            System.out.println(person.getAge());
        }

        for (Person person: arrayList){
            System.out.println(person.getName());
        }
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
