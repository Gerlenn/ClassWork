package com.example.myclasswork.Arrays;

public class DoubleArray {

    public static void main(String[] args) {

        int[][] massive2D = new int[][]{{1, 2, 3}, {4, 5, 6}};

        for (int i = 0; i < massive2D.length; i++) {
            for (int j = 0; j < massive2D[i].length; j++) {
                System.out.print(massive2D[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\n");

        for (int[] massive1D : massive2D) {
            for (int element : massive1D) {
                System.out.print(element + " ");
            }
        }
        System.out.println("\n");

        int[][] numbers = new int[3][3];
        numbers[0][0] = 1;
        numbers[0][1] = 2;
        numbers[1][0] = 3;
        numbers[1][1] = 4;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
