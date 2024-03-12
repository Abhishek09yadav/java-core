package com.learning.core.day7;

import java.util.Stack;

public class D07P04 {
    public static int evaluateExpression(String expression) {
        Stack<Integer> operandStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();

        // Define precedence of operators
        int[] precedence = new int[128];
        precedence['+'] = precedence['-'] = 1;
        precedence['*'] = precedence['/'] = 2;

        for (char c : expression.toCharArray()) {
            if (Character.isDigit(c)) {
                operandStack.push(c - '0');
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                while (!operatorStack.isEmpty() && precedence[c] <= precedence[operatorStack.peek()]) {
                    char operator = operatorStack.pop();
                    int operand2 = operandStack.pop();
                    int operand1 = operandStack.pop();
                    operandStack.push(applyOperator(operator, operand1, operand2));
                }
                operatorStack.push(c);
            }
        }

        while (!operatorStack.isEmpty()) {
            char operator = operatorStack.pop();
            int operand2 = operandStack.pop();
            int operand1 = operandStack.pop();
            operandStack.push(applyOperator(operator, operand1, operand2));
        }

        return operandStack.peek();
    }

    private static int applyOperator(char operator, int operand1, int operand2) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

    public static void main(String[] args) {
        String expression = "10+2*6";
        int result = evaluateExpression(expression);
        System.out.println("Input: " + expression);
        System.out.println("Output: " + result);
    }
}
