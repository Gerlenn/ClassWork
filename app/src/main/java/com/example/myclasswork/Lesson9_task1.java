package com.example.myclasswork;

public class Lesson9_task1 {
    //Задача, вывести среднее значение
    public static void main(String[] args) {
        int[] temp = new int[]{16, -17, 22, 0, 21, 33, 5, 4, -7};
        double averageTemp;
        int sumOfAllTemp = 0;

        for (int i = 0; i < temp.length; i++) {
            sumOfAllTemp += temp[i];
        }
        averageTemp = (double) sumOfAllTemp/temp.length;
        System.out.println(averageTemp);
    }
}
