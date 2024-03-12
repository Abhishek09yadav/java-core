package com.learning.core.day7;

import java.util.Stack;

public class D07P06 {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(3);
        stack.push(31);
        stack.push(98);
        stack.push(92);
        stack.push(23);
        System.out.println("Minimum element in the stack: " + findMin(stack));
    }

    public static int findMin(Stack<Integer> stack) {
        int min = Integer.MAX_VALUE;
        for(Integer element : stack){
            if(element<min){
                min = element;
            }
        }
        return min;
    }
}
