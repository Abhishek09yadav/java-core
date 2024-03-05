package com.learning.core.day3;

import java.util.Scanner;

public class D03P02 {
    public static boolean checkNumbers(int[] array, int num1, int num2) {

        boolean checknum1 = false;
        boolean checknum2 = false;
        for (int num : array) {
            if (num == num1) {
                checknum1 = true;
            }
            if (num == num2) {
                checknum2 = true;
            }
            if (checknum1 && checknum2) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers between 1 and 40:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int[] arr = new int[5];
        System.out.println("Enter five numbers between 1 and 40:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
       boolean res =  checkNumbers(arr,  num1, num2);
        if (res){
            System.out.println("It's Bingo!");
        } else {
            System.out.println("Not Found");
        }
    }
}
