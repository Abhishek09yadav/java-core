package com.learning.core.day8;

public class D08P02 {
    public static void main(String[] args) {
        QueueLinkedList queue = new QueueLinkedList();
        queue.enqueue(89);
        queue.enqueue(99);
        queue.enqueue(109);
        queue.enqueue(209);
        queue.enqueue(309);
        queue.displayQueue();
        System.out.println("After removing two elements:");
        queue.dequeue();
        queue.dequeue();
        queue.displayQueue();
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }

}

class QueueLinkedList {
    Node front, rear;

    QueueLinkedList() {
        front = null;
        rear = null;
    }

    void enqueue(int item) {
        Node newNode = new Node(item);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println(item + " is added to the queue");
    }

    int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        int item = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        System.out.println(item + " is removed from the queue");
        return item;
    }

    void displayQueue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        Node temp = front;
        System.out.print("Elements in the queue are: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}