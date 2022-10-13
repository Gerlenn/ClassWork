package com.example.myclasswork;
import java.util.Arrays;

public class Lesson9_task2 {
    public static void main(String[] args) {
        int[] mas = {25, 47, 34, 18, 96, 33, 28, 55, 87, 13};
//        int max = mas[0];
//        int min = mas[0];
//
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas.length; j++) {
//                if(mas[i] >= mas[j] ){
//                    max = mas[i];
//                }
//                if (max > mas[i])
//                    min = mas[i];
//            }
//        }
//
//        System.out.println(min);
//        System.out.println(max);

        int maxValue;
        int minValue;
        Arrays.sort(mas);
        minValue = mas[0];
        maxValue = mas[mas.length-1];
        System.out.println("minValue = " + minValue + " MaxValue = " + maxValue);
    }
}
