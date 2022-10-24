package com.example.myclasswork;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Lesson12_1 {

    static Consumer<String> printUpperCase = str -> {
        System.out.print(str.toUpperCase() + " ");
    };

    public static void main(String[] args) {

        ArrayList<Person> personArrayList = new ArrayList<Person>();
        personArrayList.add(new Person("Gleb"));
        personArrayList.add(new Person("Alex"));
        personArrayList.add(new Person("Oleg"));
        personArrayList.add(new Person("Kolya"));
        personArrayList.add(new Person("Arina"));

//        System.out.println(personArrayList);

//        for (Person person: personArrayList) {
//            System.out.print(person.getName() + " ");
//        }

        System.out.println(personArrayList);

        personArrayList.stream().map(Person::getName).forEach((n) -> {
            System.out.print(n + " ");
        });


        personArrayList.stream().map(Person::getName).forEach((printUpperCase));

    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
