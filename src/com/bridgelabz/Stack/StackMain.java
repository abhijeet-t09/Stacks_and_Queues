package com.bridgelabz.Stack;

public class StackMain {
    public static void main(String[] args) {
        System.out.println("-- DSA: Stack Program --\n");

        Stack<Integer> stack = new Stack<>();

        stack.push(70);
        stack.push(30);
        stack.push(56);
        stack.print();

        System.out.println();

        while(!stack.isEmpty()){

            System.out.println("Element at Head: " + stack.peek());
            System.out.println("Element to Pop: " + stack.pop());
            System.out.println();
            stack.print();
            System.out.println();
        }
    }
}
