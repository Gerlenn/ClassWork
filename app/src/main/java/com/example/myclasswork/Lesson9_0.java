package com.example.myclasswork;
import java.util.Arrays;

public class Lesson9_0 {

    public static void main(String[] args) {
        String[] massive = {"hello", "bye", "world"};
        massive = new String[]{"hello", "bye", "world", "country"};
        System.out.println(massive[3]);

        int[] massive1 = new int[]{16, -17, 22, 0, 1, 33, 5, 4, 7};
        for (int i = 0; i <= massive1.length-1; i++) {
            System.out.print(massive1[i] + " ");
        }
        Arrays.sort(massive1);// выполняем сортировку массива
        System.out.println();
        for (int i = 0; i <= massive1.length-1 ; i++) {
            System.out.print(massive1[i] + " ");
        }
        System.out.println();
        int index = Arrays.binarySearch(massive1, 33);// работает только с отсортированным массивом
        System.out.println(index);

        int[] massive2 = new int[]{16, -17, 22, 0, 1, 33, 5, 4, 7};
        System.out.println(Arrays.toString(massive2));//Arrays.toString(massive2) - вывод массива в строку
        System.out.println("\n");

        int[] massive3 = new int[]{16, -17, 22, 0, 1, 33, 5, 4, 7};
        for (int i = 0; i < massive3.length; i++) {//лучше использовать, когда есть какие-то условия
            System.out.print(massive3[i] + " ");
        }

        for (int element: massive3) {//for each - лучше использовать, когда нужно делать просто вывод элементов
            System.out.print(element + " ");
        }
//        int[] massive2 = new int[5];
//        massive2[0] = 1;
//        massive2[1] = 2;
//        massive2[2] = 3;
//        massive2[3] = 4;
//        massive2[4] = 5;
//
//        System.out.println(massive[0]);
//
//        for (int i = 0; i < massive.length; i++) {
//            System.out.println(massive[i] + "\n");
//        }
//        for (int i = 0; i < massive2.length; i++) {
//            System.out.println(massive2[i] + "\n");
//        }

    }
}
