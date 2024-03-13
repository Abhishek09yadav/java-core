package com.learning.core.day8;

public class D08P01 {
    public static void main(String[] args) {

        QueueArray queue = new QueueArray(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.displayQueue();
        System.out.println("After removing first element:");
        queue.dequeue();
        queue.displayQueue();

    }
}

class QueueArray {
    private final int[] arr;
    private int front;
    private int rear;
    private final int capacity;
    private int count;

    public QueueArray(int size) {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = item;
        count++;
        System.out.println(item + " is added to the queue");
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int temp = arr[front];
        front = (front + 1) % capacity;
        count--;
        return temp;
    }

    public boolean isFull() {
        return capacity == front;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        return arr[front];
    }

    public boolean isEmpty() {
        return (count == 0);
    }

    public int size() {
        return count;
    }

    public void displayQueue() {
        System.out.print("Elements in the queue are: ");
        for (int i = 0; i < count; i++)
            System.out.println(arr[(i + front) % count]);

    }
}