package com.learning.core.day7;

import java.util.*;
import java.util.Stack;
public class D07P05 {

    static Stack<Integer> stack = new Stack<>();

    static void insertAtBottom(int x) {
        if (stack.isEmpty()) {
            stack.push(x);
        } else {
            int a = stack.pop();
            insertAtBottom(x);
            stack.push(a);
        }
    }

    static void reverse() {
        if (!stack.isEmpty()) {
            int x = stack.pop();
            reverse();
            insertAtBottom(x);
        }
    }

    public static void main(String[] args) {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Original Stack: " + stack);

        reverse();

        System.out.println("Reversed Stack: " + stack);
    }
}
