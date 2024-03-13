package com.learning.core.day8;

import java.util.LinkedList;
import java.util.Queue;


//public class D08P04 {
//}


class D08P04 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Queue<String> emptyQueue = new LinkedList<>();

        // Add elements to the queue
        queue.add("Yellow");
        queue.add("Green");
        queue.add("Pink");
        queue.add("Black");
        queue.add("Blue");
        queue.add("White");

        // Check if the queue is empty
        if (queue.isEmpty()) {
            System.out.println("Output 1: Empty");
        } else {
            System.out.println("Output 1: Not Empty");
        }

        // Check if the emptyQueue is empty
        if (emptyQueue.isEmpty()) {
            System.out.println("Output 2: Empty");
        } else {
            System.out.println("Output 2: Not Empty");
        }
    }
}