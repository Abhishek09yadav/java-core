package com.learning.core.day8;

import java.util.*;

public class D08P03 {
    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(5);
        circularQueue.enqueue(14);
        circularQueue.enqueue(13);
        circularQueue.enqueue(22);
        circularQueue.display();
        System.out.println("Peek: " + circularQueue.peek());
        System.out.println("Dequeue: " + circularQueue.dequeue());
        System.out.println("Peek after dequeue: " + circularQueue.peek());
        circularQueue.display();
    }
}

class CircularQueue {
    private int maxSize;
    private int[] arr;
    private int front;
    private int rear;

    public CircularQueue(int size) {
        maxSize = size;
        arr = new int[maxSize];
        front = -1;
        rear = -1;
    }

    public void enqueue(int item) {
        if (isEmpty()) {
            front = 0;
            rear = 0;
            arr[rear] = item;
        } else {
            rear = (rear + 1) % maxSize;
            if (rear == front) {
                System.out.println("Queue is full. Cannot enqueue.");
                rear = (rear - 1 + maxSize) % maxSize;
            } else {
                arr[rear] = item;
            }
        }
    }

    public int dequeue() {
        int item = -1;
        if (!isEmpty()) {
            item = arr[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % maxSize;
            }
        } else {
            System.out.println("Queue is empty. Cannot dequeue.");
        }
        return item;
    }

    public int peek() {
        if (!isEmpty()) {
            return arr[front];
        } else {
            System.out.println("Queue is empty. No peek value.");
            return -1;
        }
    }

    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Elements in circular queue: ");
        int i = front;
        while (i != rear) {
            System.out.print(arr[i] + " ");
            i = (i + 1) % maxSize;
        }
        System.out.println(arr[rear]);
    }
}