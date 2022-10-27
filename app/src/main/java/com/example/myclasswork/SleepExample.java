package com.example.myclasswork;

public class SleepExample {

    public static void main(String[] args) {

        ThreadClass6 threadClass6 = new ThreadClass6();
        threadClass6.start();
        long start = System.currentTimeMillis();
        System.out.println("called in thread: " + Thread.currentThread().getName() + " " + start);
    }
}

class ThreadClass6 extends Thread {

    @Override
    public void run() {
        try {
            sleep(2000);
            long start = System.currentTimeMillis();
            Thread thread = Thread.currentThread();
            System.out.println("I run this code in: " + thread.getName() + " " + start);
        } catch (InterruptedException e) {}
    }
}