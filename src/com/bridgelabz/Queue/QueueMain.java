package com.bridgelabz.Queue;

public class QueueMain {
    public static void main(String[] args) {
        System.out.println("-- DSA: Queue Program --\n");

        Queue<Integer> queue = new Queue<>();

        queue.enqueue(56);
        queue.print();
        System.out.println();

        queue.enqueue(30);
        queue.print();
        System.out.println();

        queue.enqueue(70);
        queue.print();

        System.out.println();
        while(!queue.isEmpty()){
            System.out.println("Element at Head: " + queue.peek());
            System.out.println("Element to Pop: " + queue.dequeue());
            queue.print();
            System.out.println();
        }
    }
}
