package com.bridgelabz.Queue;

import com.bridgelabz.LinkedList.*;

public class Queue<T> {
    LinkedList<T> linkedList;

    public Queue() {
        this.linkedList = new LinkedList<>();
    }

    public void enqueue(T key) {
        linkedList.add(key);
    }
    public void print() {
        linkedList.print();
    }
}
