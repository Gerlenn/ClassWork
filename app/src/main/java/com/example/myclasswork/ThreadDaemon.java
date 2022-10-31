package com.example.myclasswork;

public class ThreadDaemon {

    public static void main(String[] args) {
        ThreadClass1 threadClass1 = new ThreadClass1();
        threadClass1.setDaemon(true);
        threadClass1.start();
    }
}

class ThreadClass1 extends Thread{

    @Override
    public void run() {
        System.out.println("I'm a daemon thread " + Thread.currentThread().isDaemon());
    }
}
