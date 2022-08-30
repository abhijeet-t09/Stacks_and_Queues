package com.bridgelabz.LinkedList;

public class LinkedList<T> {

    Node<T> head;
    Node<T> tail;

    public void push(T data){
        Node<T> node = new Node<>(data);

        if(head == null){
            head = node;
            tail = node;
        }
        else{
            node.next = head;
            head = node;
        }
    }

    public T pop() {
        T deleteElement = head.data;
        head = head.next;
        return deleteElement;
    }

    public void add(T data){
        Node<T> node = new Node<>(data);
        if(head == null){
            head = node;
            tail = node;
        }
        else{
            tail.next = node;
            tail = node;
        }
    }

    public T peek(){
        return head.data;
    }

    public int size(){
        int count=0;
        Node<T> temp = head;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        return count;
    }

    public void print(){
        Node<T> temp = head;

        while (temp != null){
            System.out.print(temp.data+ " -> ");
            temp = temp.next;
        }
        System.out.println(tail.next);
    }
}
