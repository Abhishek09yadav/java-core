package com.learning.core.day9;

import java.util.Scanner;

public class D09P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int size = scanner.nextInt();


        int[] array = new int[size];


        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }


        System.out.println("Enter the element to search for:");
        int toFind = scanner.nextInt();


        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == toFind) {
                found = true;
                break;
            }
        }


        if (found) {
            System.out.println("Element is Present");
        } else {
            System.out.println("Element is Not Present");
        }


        scanner.close();
    }

}

