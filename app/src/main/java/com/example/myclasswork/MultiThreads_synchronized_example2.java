package com.example.myclasswork;

public class MultiThreads_synchronized_example2 {

    public static void main(String[] args) {
        CountThread countThread = new CountThread();

        Thread thread1 = new Thread(countThread);
        thread1.start();

        Thread thread2 = new Thread(countThread);
        thread2.start();
    }
}

class CountThread implements Runnable{


    private int count = 0;

//    synchronized void changeValue(int addValue){
//
//        count = addValue;
//        System.out.print(count + " ");
//    }
    synchronized void changeValue(int addValue){

        count = addValue;
        System.out.print(count + " ");
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            changeValue(i);
        }
    }
}
//2 способ(синхронизируем метод)
//package com.example.myclasswork;
//
//public class MultiThreads_synchronized_example2 {
//
//    public static void main(String[] args) {
//        CountThread countThread = new CountThread();
//
//        Thread thread1 = new Thread(countThread);
//        thread1.start();
//
//        Thread thread2 = new Thread(countThread);
//        thread2.start();
//    }
//}
//
//class CountThread implements Runnable{
//
//
//    private int count = 0;
//
//    //    synchronized void changeValue(int addValue){
////
////        count = addValue;
////        System.out.print(count + " ");
////    }
//    synchronized void changeValue(){
//        for (int i = 0; i < 10; i++) {
//            count++;
//            System.out.print(count + " ");
//        }
//    }
//
//    @Override
//    public void run() {
//        changeValue();
//    }
//}