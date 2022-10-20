package com.example.myclasswork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lesson11 {

    public static void main(String[] args) {
        //int[] numbers = new int[]{3, 1, 4, 6, 2, 5, 7, 9, 8};
        //List.of - преобразование массива в коллекцию, не сработает если бы был примитивный тип массива
        //List arrayList = new ArrayList(List.of(numbers));
        Object[] numbers = {3, 1, 4, 6, 2, 5, 7, 9, 8};
        List arrayList = new ArrayList(Arrays.asList(numbers));
        arrayList.add(0);//добавили значение в коллекцию
        Collections.sort(arrayList);//сортировка по возрастанию
        Collections.reverse(arrayList);//обратный вывод коллекции
        arrayList.toArray();//преобразование обратно в НОВЫЙ массив

        for (int value = 0; value < arrayList.size(); value++) {
            System.out.print(arrayList.get(value) + " ");
        }
    }
}
