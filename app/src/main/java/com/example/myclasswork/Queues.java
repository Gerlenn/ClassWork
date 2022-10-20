package com.example.myclasswork;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queues {

    public static void main(String[] args) {

        Queue queue = new PriorityQueue();
        queue.offer("Hello");
        queue.offer("Bye");
        queue.offer("World");

        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        //System.out.println(queue.element());//вывод первого элемента
        //System.out.println(queue.poll());//удаление первого элемента
        queue.remove("Hello");//удаление элемента по указанному значению
    }
}
