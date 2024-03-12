package com.learning.core.day7;
import java.util.*;
import java.util.Stack;
public class D07P01 {


    public static void main(String[] args) {
        StackClass stack = new StackClass(5);
        stack.push("Hello");
        stack.push("world");
        stack.push("java");
        stack.push("Programming");
        stack.displayStack();
        System.out.println("Popped element: " + stack.pop());
        stack.displayStack();

    }
}

class StackClass {
    private int n;
    private String[] arr;
    private int top;

    StackClass(int n) {
        this.n = n;
        this.arr = new String[n];
        this.top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }
    public boolean isFull(){
        return (n-1 == top);
    }
    public void push(String data){
       if (isFull()){
            System.out.println("stack overflow");
        }
       else {
           arr[++top] = data;
       }
    }
    public String pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack UnderFlow");
            return null;
        }
        else {
            String temp = arr[top];
            top--;
            return temp;
        }

    }
    public void displayStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

}