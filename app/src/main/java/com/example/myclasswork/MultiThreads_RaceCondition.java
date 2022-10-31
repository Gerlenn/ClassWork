package com.example.myclasswork;
//reproduce RaceCondition
public class MultiThreads_RaceCondition {

    public static void main(String[] args) {
        ThreadClass threadClass = new ThreadClass();

        Thread thread1 = new Thread(threadClass);
        thread1.start();
        Thread thread2 = new Thread(threadClass);
        thread2.start();
    }
}

class ThreadClass implements Runnable {

    private int count = 0;
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            count++;
            System.out.print(count + " ");
        }
    }
}
