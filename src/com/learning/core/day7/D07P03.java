package com.learning.core.day7;

import java.util.Stack;

public class D07P03 {
    public static String reverseString(String input){
        Stack<Character> stack= new Stack<>();
        for(char c : input.toCharArray())
        {
            stack.push(c);
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();


    }
//    public boolean isEmpty(){
//
//        return top == -1;
//    }
    public static void main(String[] args) {
        String input = "JavaQuiz";
        String reversed = reverseString(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + reversed);
    }
}
