package com.learning.core.day8;

import java.util.LinkedList;
import java.util.Queue;

public class D08P05 {

    public static Queue<Integer>[] splitQueue(Queue<Integer> queue) {
        Queue<Integer> evenQueue = new LinkedList<>();
        Queue<Integer> oddQueue = new LinkedList<>();
        while (!queue.isEmpty()) {
            int num = queue.remove();
            if (num % 2 == 0) {
                evenQueue.add(num);

            } else {
                oddQueue.add(num);
            }
        }
//        return new Queue[]{oddQueue, evenQueue}; // this also works
        Queue<Integer>[] res = new Queue[2];
        res[0] = oddQueue;
        res[1] = evenQueue;
        return res;

    }

    public void displayQueue(Queue<Integer> queue) {
        for (int num : queue) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue<Integer> inputQueue = new LinkedList<>();
        inputQueue.add(7);
        inputQueue.add(9);
        inputQueue.add(5);
        inputQueue.add(2);
        inputQueue.add(4);
        inputQueue.add(6);
        inputQueue.add(10);
        D08P05 instance = new D08P05(); // since im not using static display method

        System.out.println("Original Array");
        instance.displayQueue(inputQueue);


        Queue<Integer>[] res = splitQueue(inputQueue);
        Queue<Integer> odd = res[0];
        Queue<Integer> even = res[1];


        System.out.println("Odd Queue:");
        instance.displayQueue(odd);
        System.out.println("Even Queue:");
        instance.displayQueue(even);

    }
}
