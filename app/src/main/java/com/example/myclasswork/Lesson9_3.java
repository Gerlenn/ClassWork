package com.example.myclasswork;
import java.util.Scanner;

public class Lesson9_3 {
//enter value from console
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you number: ");
        if(sc.hasNextInt()){
            int enteredValue = sc.nextInt();
            System.out.println("Your value is: " + enteredValue);
        }else {
            System.out.println("Your inout value is wrong...");
        }
    }
}
