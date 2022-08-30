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

    public void print(){
        Node<T> temp = head;

        while (temp != null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
    }
}
