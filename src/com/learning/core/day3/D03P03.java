package com.learning.core.day3;

import java.util.Scanner;

public class D03P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] A = new int[18];


        System.out.println("Enter 18 integer values:");
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextInt();
        }


        int sum = 0;
        for (int i = 0; i <= 14; i++) {
            sum += A[i];
        }
        A[15] = sum;


        double average = (double) sum / A.length;
        A[16] = (int) average;

        int smallest = A[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i] < smallest) {
                smallest = A[i];
            }
        }
        A[17] = smallest;

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
