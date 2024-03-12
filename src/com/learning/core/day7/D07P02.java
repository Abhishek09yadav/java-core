package com.learning.core.day7;

class Node {
    double data;
    Node next;

    Node(double data) {
        this.data = data;
        next = null;
    }
}

class Stack {
    Node top;

    Stack() {
        top = null;
    }

    void push(double x) {
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
    }

    double pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return Double.MIN_VALUE;
        }

        double value = top.data;
        top = top.next;
        return value;
    }

    void display() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }

        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10.0);
        stack.push(20.0);
        stack.push(30.0);
        stack.push(40.0);

        System.out.println("The elements of the stack are: ");
        stack.display();

        stack.pop();
        stack.pop();

        System.out.println("After popping twice: ");
        stack.display();
    }
}