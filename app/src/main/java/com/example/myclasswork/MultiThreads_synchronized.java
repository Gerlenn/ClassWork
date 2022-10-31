package com.example.myclasswork;

public class MultiThreads_synchronized {

    public static void main(String[] args) {

        CommonResource commonResource = new CommonResource();
        for (int i = 1; i < 6; i++) {
            Thread thread = new Thread(new CounterThread(commonResource));
            thread.setName("Thread: " + i);
            thread.start();
        }
    }
}

class CommonResource {
    int count = 0;
}

class CounterThread implements Runnable {

    CommonResource commonResource;

    CounterThread(CommonResource commonResource) {
        this.commonResource = commonResource;
    }

    @Override
    public void run() {
        ///////здесь мьютекс!!!!
        synchronized (commonResource) {
            commonResource.count = 1;
            for (int i = 1; i < 5; i++) {
                System.out.printf(
                        "%s %d \n",
                        Thread.currentThread().getName(),
                        commonResource.count);
                commonResource.count++;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
