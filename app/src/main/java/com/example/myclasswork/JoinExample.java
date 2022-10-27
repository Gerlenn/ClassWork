package com.example.myclasswork;

public class JoinExample {

    public static void main(String[] args) {
        System.out.println("Main Thread is running");

        Thread thread = new Thread(){
            @Override
            public void run() {
                System.out.println("Second thread is running");
            }
        };
        thread.start();

//        try {
//            thread.join();
//        } catch (InterruptedException e) {
//            System.out.println("caught exception");
//        }

        System.out.println("Main Thread is finished");
    }
}

//это про supper
class MainS{
    public static void main(String[] args) {
        Child child = new Child();
        child.callType();
    }
}


class Parent{

    void callType(){
        System.out.println("parent");
    }
}

class Child extends Parent{

    @Override
    void callType() {
        super.callType();
    }
}
