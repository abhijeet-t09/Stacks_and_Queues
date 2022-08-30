package com.bridgelabz.Queue;

public class QueueMain {
    public static void main(String[] args) {

        Queue<Integer> queue = new Queue<>();

        queue.enqueue(56);
        queue.print();
        System.out.println();

        queue.enqueue(30);
        queue.print();
        System.out.println();

        queue.enqueue(70);
        queue.print();
    }
}
