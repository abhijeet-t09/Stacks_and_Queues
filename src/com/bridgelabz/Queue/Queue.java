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

    public T dequeue() {
        return linkedList.pop();
    }

    public T peek(){
        return linkedList.peek();
    }

    public void print() {
        linkedList.print();
    }

    public boolean isEmpty(){
        if(linkedList.size() == 0)
            return true;
        else
            return false;
    }
}
