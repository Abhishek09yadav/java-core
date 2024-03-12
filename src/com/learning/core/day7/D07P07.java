package com.learning.core.day7;

import java.util.Stack;

public class D07P07 {
    public static boolean isTopEven(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
           return stack.peek()%2 == 0;
        }

        return false;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(3);
        stack.push(31);
        stack.push(98);
        stack.push(92);
        stack.push(23);

        System.out.println("Is the top element even? " + isTopEven(stack));

    }
}
